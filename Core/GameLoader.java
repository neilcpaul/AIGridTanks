package Core; /**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 11/11/12
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
import Map.Grid;
import Player.Player;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class GameLoader {

    private static int gridWidth;
    private static int gridHeight;
    private static int players;
    private static int playerUnits;
    private static int playerUnitsInitHealth;

    private static Grid grid;
    private static ArrayList<String> playerNames = new ArrayList<String>();
    private static ArrayList<Player> playersList;

    public static int getGridWidth() {
        return gridWidth;
    }

    public static int getGridHeight() {
        return gridHeight;
    }

    public static int getPlayers() {
        return players;
    }

    public static int getPlayerUnits() {
        return playerUnits;
    }

    public static int getPlayerUnitsInitHealth() {
        return playerUnitsInitHealth;
    }

    public GameLoader()
    {
        loadSettings();
        generatePlayers();
        grid = new Grid();
    }

    public GameLoader(String debug)
    {
        loadSettings();

        System.out.println("-----DEBUG Mode-----");
        System.out.println("Class: " + this.getClass().toString());
        System.out.println("Height: " + getGridHeight());
        System.out.println("Width: " + getGridWidth());
        System.out.println("Players: " + getPlayers());
        System.out.println("Units/player: " + getPlayerUnits());
        System.out.println("Initial unit health: " + getPlayerUnitsInitHealth());
        System.out.println();
        System.out.println("Players:\n");

         generatePlayers();

        for (int i=0 ; i<playersList.size() ; i++)
        {
            System.out.println(playersList.get(i).toString());
        }

        grid = new Grid();
        grid.toString();
    }

    public void generatePlayers()
    {
        playersList = new ArrayList<Player>();
        for (int i = 0 ; i < GameLoader.getPlayers() ; i++)
        {
            //TODO implement full player name catcher
            playersList.add(new Player((i+1), playerNames.get(i)));
        }
    }

    public void loadSettings()
    {
        try
        {
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("D:\\Uni\\AI_Game_Assignment\\Game\\src\\Core\\game.properties");
            props.load(fis);

            gridHeight = Integer.parseInt(props.getProperty("game.map.height"));
            gridWidth = Integer.parseInt(props.getProperty("game.map.width"));
            players = Integer.parseInt(props.getProperty("game.players"));
            playerUnits = Integer.parseInt(props.getProperty("game.player.units"));
            playerUnitsInitHealth = Integer.parseInt(props.getProperty("game.player.units.initialHealth"));
            playerNames.add(props.getProperty("game.player.1.name"));
            playerNames.add(props.getProperty("game.player.2.name"));
        }
        catch (Exception e)
        {
            System.out.println(e.getCause());
            System.out.println("Applying default settings...");

            gridHeight = 10;
            gridWidth = 10;
            players = 2;
            playerUnits = 4;
            playerUnitsInitHealth = 100;
        }

    }
}
