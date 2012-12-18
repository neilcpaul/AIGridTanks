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
public class ItemAmmo extends Item {
    private String itemName = "AmmoItem";
    private String shortName = "A";
    private String desc = "Refill all ammo";
    private File sprite = null;

    public ItemAmmo()
    {
        super.setItemName(itemName);
        super.setShortName(shortName);
        super.setDesc(desc);
    }

    //TODO implement weapons and ammo

}
