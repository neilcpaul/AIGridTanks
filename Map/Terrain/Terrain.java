package Map.Terrain;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 11/11/12
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class Terrain {

    private String terrainName = "Map/Terrain";
    private String shortName = "T";
    private File sprite = null;
    private boolean playerCanUse = true;

    public Terrain()
    {
    }

    public Terrain(String TerrainName, String shortName, File sprite, boolean playerCanUse)
    {
        this.terrainName = TerrainName;
        this.shortName = shortName;
        this.sprite = sprite;
        this.playerCanUse = playerCanUse;
    }

    public String toString()
    {
        return terrainName;
    }

    public String getShortName()
    {
        return shortName;
    }

    public String getTerrainName() {
        return terrainName;
    }

    public void setTerrainName(String terrainName) {
        this.terrainName = terrainName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public File getSprite() {
        return sprite;
    }

    public void setSprite(File sprite) {
        this.sprite = sprite;
    }

    public boolean isPlayerCanUse() {
        return playerCanUse;
    }

    public void setPlayerCanUse(boolean playerCanUse) {
        this.playerCanUse = playerCanUse;
    }
}
