package Player;

import Core.GameLoader;
import Weapon.*;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 03:37
 * To change this template use File | Settings | File Templates.
 */
public class Unit {
    private int playerNumber;
    private static ArrayList<Weapon> unitWeapons;
    private int health;
    private int[][] currentLocation = new int[1][1];

    public Unit()
    {
        this.health = GameLoader.getPlayerUnitsInitHealth();
        unitWeapons = new ArrayList<Weapon>();
        unitWeapons.add(new WeaponMachineGun());
        unitWeapons.add(new WeaponGrenade());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Weapon> getUnitWeapons() {
        return unitWeapons;
    }

    public String toString()
    {
        String weaponsList = "";
        for (int i=0 ; i<unitWeapons.size() ; i++)
        {
            weaponsList = weaponsList + unitWeapons.get(i).toString() +"\n";
        }
        return "Unit Health: " + getHealth() + "\n"
                + weaponsList + "\n";
    }
}
