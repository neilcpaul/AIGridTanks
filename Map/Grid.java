package Map;

import Core.GameLoader;
import Item.ItemAmmo;
import Item.ItemHealth;
import Item.ItemWeapon;
import Map.Terrain.Terrain;
import Map.Terrain.TerrainCover;
import Map.Terrain.TerrainElevated;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 11/11/12
 * Time: 20:51
 * To change this template use File | Settings | File Templates.
 */
public class Grid {

    private static ArrayList<ArrayList<GridSquare>> grid;

    public Grid()
    {
        this.initGrid();
    }

    private void initGrid()
    {
        //init whole grid as terrain
        grid = new ArrayList<ArrayList<GridSquare>>();
        for (int height = 0 ; height < GameLoader.getGridHeight() ; height++)
        {
            ArrayList<GridSquare> temp = new ArrayList<GridSquare>();
            for (int width = 0 ; width < GameLoader.getGridWidth() ; width++)
            {
                temp.add(new GridSquare());
                temp.get(width).setType(new Terrain());
            }
            grid.add(temp);
        }
        //populate grid with terrain types
        this.populateGridTerrain();
        //populate with player spawn types
        this.populateGridPlayerSpawnPoints();
        //populate with weapons
        this.populateGridAirdrops();
    }

    private void populateGridTerrain() {
        //Generate a cover:elevated terrain ratio
        double coverToElevation = Math.random() / 4 + 0.25;

        //probability of placing cover/elevation sin(pi*x)/1.8, where x is square location with respect to starting places
        //populate cover and elevation
        for (int height = 0 ; height < GameLoader.getGridHeight() ; height++)
            for (int width = 0 ; width < GameLoader.getGridWidth() ; width++)
            {
                //Generate random key
                double randomKey = Math.random();
                double widthCoefficient = (double)width/(double) GameLoader.getGridWidth();
                double probability = (Math.sin(Math.PI*widthCoefficient))/1.8;

                if (randomKey < probability)
                {
                    //Generate either cover or elevation
                    if (randomKey < coverToElevation)
                    {
                        //Place cover
                        grid.get(height).get(width).setType(new TerrainCover());
                    }
                    else
                    {
                        grid.get(height).get(width).setType(new TerrainElevated());
                    }
                }

            }
    }

    private void populateGridPlayerSpawnPoints()
    {
        int players = GameLoader.getPlayers();
        int units = GameLoader.getPlayerUnits() < GameLoader.getGridWidth() ? GameLoader.getPlayerUnits() : GameLoader.getGridWidth();

        // Populate grid with player initial spawn points
        //TODO Implement more than 2 players
        if (players == 2)
        {
            //Generate random starting point for P1
            do
            {
                int sp = new Random().nextInt(GameLoader.getGridHeight());
                if (!grid.get(sp).get(0).isSpawnPoint())
                {
                    grid.get(sp).get(0).setSpawnPoint(1);
                    units--;
                }
            } while (units > 0);

            units = GameLoader.getPlayerUnits();

            //Generate random starting point for P2
            do
            {
                int sp = new Random().nextInt(GameLoader.getGridHeight());
                if (!grid.get(sp).get(grid.get(sp).size()-1).isSpawnPoint())
                {
                    grid.get(sp).get(grid.get(sp).size() - 1).setSpawnPoint(2);
                    units--;
                }
            } while (units > 0);

        }
    }

    private void populateGridAirdrops()
    {
        //probability of placing an item is sin(pi*x)/8, (slightly less than terrain) where x is square location with respect to starting places
        //populate items
        for (int height = 0 ; height < GameLoader.getGridHeight() ; height++)
            for (int width = 0 ; width < GameLoader.getGridWidth() ; width++)
            {
                //Generate two random keys, one for placement, and one to decide on type of item
                double randomPlacementKey = Math.random();
                double randomItemTypeKey = Math.random();
                double widthCoefficient = (double)width/(double) GameLoader.getGridWidth();
                double probability = (Math.sin(Math.PI*widthCoefficient))/8;

                if (randomPlacementKey < probability && !grid.get(height).get(width).isFull())
                {
                    //Generate either cover or elevation
                    if (randomItemTypeKey <= 0.30)
                    {
                        //Place health
                        grid.get(height).get(width).setItem(new ItemHealth());
                    }
                    else if (randomItemTypeKey > 0.30 && randomItemTypeKey <= 0.75)
                    {
                        //Place weapon
                        grid.get(height).get(width).setItem(new ItemWeapon());
                    }
                    else if (randomItemTypeKey > 0.75)
                    {
                        //Place ammo
                        grid.get(height).get(width).setItem(new ItemAmmo());
                    }
                }

            }
    }

    public static ArrayList<ArrayList<GridSquare>> getGrid() {
        return grid;
    }

    public String toString()
    {
        for (int width = 0 ; width < GameLoader.getGridWidth() ; width++)
        {
            for (int height = 0 ; height < GameLoader.getGridHeight() ; height++)
            {
                System.out.print("[" + grid.get(height).get(width).toGridString() + "]");
            }
            System.out.print("\n");
        }
        return "printed";
    }
}
