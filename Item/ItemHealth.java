package Item;

import Item.Item;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class ItemHealth extends Item {
    private String itemName = "HealthItem";
    private String shortName = "H";
    private String desc = "Adds 50 points to units health";
    private File sprite = null;

    public ItemHealth()
    {
        super.setItemName(itemName);
        super.setShortName(shortName);
        super.setDesc(desc);
    }

    //TODO implement health addition to units

}
