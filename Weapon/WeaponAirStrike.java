package Weapon;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class WeaponAirStrike extends Weapon {
    private String weaponName = "AirStrikeWeapon";
    private String shortName = "AS";
    private String desc = "Call in support to target your opposition";
    private int range = 7;
    private int accuracy = 95;
    private int damage = 100;
    private int selfDamage = 0;
    private int maxAmmo = 1;
    private int ammoRemaining;
    private int ammoUsage = 1;
    private boolean initialWeapon = false;
    private File sprite = null;

    public WeaponAirStrike()
    {
        super.setWeaponName(this.weaponName);
        super.setShortName(this.shortName);
        super.setDesc(this.desc);
        super.setInitialWeapon(initialWeapon);
        super.setRange(this.range);
        super.setDamage(this.damage);
        super.setSelfDamage(this.selfDamage);
        super.setMaxAmmo(this.maxAmmo);
        super.setAmmoRemaining((this.maxAmmo));
        super.setAmmoUsage(this.ammoUsage);
    }
}
