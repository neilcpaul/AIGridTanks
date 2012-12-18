package Map.Terrain;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 11/11/12
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */
public class TerrainElevated extends Terrain {

    private String terrainName = "ElevatedTerrain";
    private String shortName = "E";
    private File sprite = null;

    public TerrainElevated()
    {
        super.setTerrainName(terrainName);
        super.setShortName(shortName);
        super.setSprite(sprite);
    }
}
