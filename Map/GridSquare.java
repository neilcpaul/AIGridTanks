package Map;

import Item.Item;
import Map.Terrain.Terrain;
import Player.Unit;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 11/11/12
 * Time: 20:52
 * To change this template use File | Settings | File Templates.
 */
public class GridSquare {
    private Terrain type;
    private boolean squareFull;
    private Item item;
    private Unit unit;
    private boolean spawnPoint = false;
    private int sp_playerNumber = 0;

    public Terrain getType() {
        return type;
    }

    public void setType(Terrain type) {
        this.type = type;
    }

    public boolean isFull() {
        return squareFull;
    }

    public void setFull(boolean status) {
        this.squareFull = status;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        this.setFull(true);
    }

    public void clearItem()
    {
        item = null;
        this.setFull(false);
    }

    public boolean isSpawnPoint() {
        return spawnPoint;
    }

    public void setSpawnPoint(int sp_playerNumber) {
        this.sp_playerNumber = sp_playerNumber;
        this.setFull(true);
        this.spawnPoint = true;
    }

    public String toGridString()
    {
        if (isFull())
        {
            if (isSpawnPoint())
                return type.getShortName() + ":" + sp_playerNumber;
            else return type.getShortName() + ":" + this.getItem().getShortName();
        }
        else return type.getShortName() + "  ";
    }
}
