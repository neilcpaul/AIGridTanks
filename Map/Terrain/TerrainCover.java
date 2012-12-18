package Map.Terrain;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 11/11/12
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */
public class TerrainCover extends Terrain {

    private String terrainName = "CoverTerrain";
    private String shortName = "C";
    private File sprite = null;

    public TerrainCover()
    {
        super.setTerrainName(terrainName);
        super.setShortName(shortName);
        super.setSprite(sprite);
    }
}
