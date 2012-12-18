package Item;

import Item.Item;
import Weapon.*;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class ItemWeapon extends Item {
    private String itemName = "WeaponItem";
    private String shortName = "W";
    private String desc = "Random weapon drop for the players unit";
    private Weapon weapon;
    private File sprite = null;

    public ItemWeapon()
    {
        super.setItemName(itemName);
        super.setShortName(shortName);
        super.setDesc(desc);
    }

    private void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    private void weaponDropped()
    {
        double probabilityKey = Math.random();
        //Rocket 50%
        //Firebombs 30%
        //Air Strike 20%
        if (probabilityKey <= 0.5)
            this.setWeapon(new WeaponRocket());
        else if (probabilityKey > 0.5 && probabilityKey <= 0.8)
            this.setWeapon(new WeaponFirebomb());
        else this.setWeapon(new WeaponAirStrike());
    }
}
