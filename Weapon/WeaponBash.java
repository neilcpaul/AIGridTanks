package Weapon;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class WeaponBash extends Weapon {
    private String weaponName = "BashWeapon";
    private String shortName = "Ba";
    private String desc = "Bash your unit into the opposition. Careful, this may hurt your unit.";
    private int range = 1;
    private int accuracy = 90;
    private int damage = 25;
    private int selfDamage = 10;
    private int maxAmmo = 0;
    private int ammoUsage = 1;
    private boolean initialWeapon = true;
    private File sprite = null;

    public WeaponBash()
    {
        super.setWeaponName(this.weaponName);
        super.setShortName(this.shortName);
        super.setDesc(this.desc);
        super.setInitialWeapon(initialWeapon);
        super.setRange(this.range);
        super.setDamage(this.damage);
        super.setSelfDamage(this.selfDamage);
        super.setMaxAmmo(this.maxAmmo);
        super.setAmmoUsage(this.ammoUsage);
    }
}
