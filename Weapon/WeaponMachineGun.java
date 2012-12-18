package Weapon;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class WeaponMachineGun extends Weapon {
    private String weaponName = "MachineGunWeapon";
    private String shortName = "MG";
    private String desc = "Standard weapon on the units";
    private int range = 2;
    private int accuracy = 90;
    private int damage = 10;
    private int selfDamage = 0;
    private int maxAmmo = 0;
    private int ammoUsage = 1;
    private boolean initialWeapon = true;
    private File sprite = null;

    public WeaponMachineGun()
    {
        super.setWeaponName(this.weaponName);
        super.setShortName(this.shortName);
        super.setDesc(this.desc);
        super.setInitialWeapon(initialWeapon);
        super.setRange(this.range);
        super.setAccuracy(this.accuracy);
        super.setDamage(this.damage);
        super.setSelfDamage(this.selfDamage);
        super.setMaxAmmo(this.maxAmmo);
        super.setAmmoUsage(this.ammoUsage);
    }
}
