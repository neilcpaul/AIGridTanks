package Weapon;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class WeaponGrenade extends Weapon {
    private String weaponName = "GrenadeWeapon";
    private String shortName = "Gr";
    private String desc = "Lob a grenade at the opposition";
    private int range = 4;
    private int accuracy = 70;
    private int damage = 25;
    private int selfDamage = 0;
    private int maxAmmo = 5;
    private int ammoUsage = 1;
    private boolean initialWeapon = true;
    private File sprite = null;

    public WeaponGrenade()
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
