package Item;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private String itemName;
    private String shortName;
    private String desc;
    private File sprite = null;

    public Item()
    {
    }

    public Item(String name, String shortName, File sprite)
    {
        this.itemName = name;
        this.shortName = shortName;
        this.sprite = sprite;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
