package Weapon;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class Weapon {
    private String weaponName;
    private String shortName;
    private String desc;
    private int range;  //in squares
    private int accuracy; //out of 100
    private int damage; // in health points (full hit)
    private int selfDamage; // in health points
    private int maxAmmo;
    private int ammoRemaining;
    private int ammoUsage; //ammo spent per turn
    private boolean initialWeapon;
    private File sprite = null;

    public Weapon()
    {
    }

    public Weapon(String weaponName, int ammoUsage, int damage, String desc, int maxAmmo, int ammoRemaining, int range, int selfDamage, String shortName) {
        this.weaponName = weaponName;
        this.ammoUsage = ammoUsage;
        this.damage = damage;
        this.desc = desc;
        this.maxAmmo = maxAmmo;
        this.ammoRemaining = ammoRemaining;
        this.range = range;
        this.selfDamage = selfDamage;
        this.shortName = shortName;
    }

    public int getAmmoUsage() {
        return ammoUsage;
    }

    public int getAmmoRemaining() {
        return ammoRemaining;
    }

    public void setAmmoRemaining(int ammoRemaining) {
        this.ammoRemaining = ammoRemaining;
    }

    public void setAmmoUsage(int ammoUsage) {
        this.ammoUsage = ammoUsage;
    }

    public boolean isInitialWeapon() {
        return initialWeapon;
    }

    public void setInitialWeapon(boolean initialWeapon) {
        this.initialWeapon = initialWeapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSelfDamage() {
        return selfDamage;
    }

    public void setSelfDamage(int selfDamage) {
        this.selfDamage = selfDamage;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int fireShot(int enemyRange)
    {
        return fireShot(enemyRange, 1);
    }

    public int fireShot(int enemyRange, int elevationMultiplier)
    {
        int finalDamage = 0;
        if (getAmmoRemaining() >= getAmmoUsage() && enemyRange < getRange())
        {
            //Calculate damage from enemy range, weapon accuracy and weapon damage
            double rangeMult = 1-(enemyRange/getRange()/10);
            double accMult = getAccuracy();
            double elevMult = (double)elevationMultiplier;
            double weapDamage = (double)getDamage();
            finalDamage = (int)Math.round(rangeMult*accMult*elevMult*weapDamage);
            if (maxAmmo != 0)
            {
                setAmmoRemaining(getAmmoRemaining()-getAmmoUsage());
            }
            if (getSelfDamage() > 0)
            {
                //TODO decrement unit health
            }
        }
        return finalDamage;
    }

    public String toString()
    {
        return weaponName + " x " + ammoRemaining;
    }
}
