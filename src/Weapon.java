public class Weapon{
    private String weaponType;
    private String weaponName;

    public java.lang.String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(java.lang.String weaponType) {
        this.weaponType = weaponType;
    }

    public java.lang.String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(java.lang.String weaponName) {
        this.weaponName = weaponName;
    }

    public Weapon(java.lang.String weaponType, java.lang.String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }
}