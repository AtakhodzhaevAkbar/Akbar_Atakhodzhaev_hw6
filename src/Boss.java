public class Boss extends GameEntity{
    private WeaponType entityWeapon;

    public Boss(int health, int damage, java.lang.String entityName, WeaponType entityWeapon) {
        super(health, damage, entityName);
        this.entityWeapon = entityWeapon;
    }

    public WeaponType getEntityWeapon() {
        return entityWeapon;
    }

    public void setEntityWeapon(WeaponType entityWeapon) {
        this.entityWeapon = entityWeapon;
    }

    public String printInfo(){
        return (this.entityName + " Health:"+this.health+" Damage:"+this.damage+" Weapon Is:"+this.entityWeapon);
    }
}
