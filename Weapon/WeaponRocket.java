package Weapon;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 02:08
 * To change this template use File | Settings | File Templates.
 */
public class WeaponRocket extends Weapon {
    private String weaponName = "RocketWeapon";
    private String shortName = "Ro";
    private String desc = "Fire a rocket at your opposition.";
    private int range = 5;
    private int accuracy = 85;
    private int damage = 50;
    private int selfDamage = 0;
    private int maxAmmo = 3;
    private int ammoUsage = 1;
    private boolean initialWeapon = false;
    private File sprite = null;

    public WeaponRocket()
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
