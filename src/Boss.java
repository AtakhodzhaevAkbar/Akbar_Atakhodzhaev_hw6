public class Boss extends GameEntity{
    private Weapon entityWeapon;

    public Boss(int health, int damage, String entityName, Weapon entityWeapon) {
        super(health, damage, entityName);
        this.entityWeapon = entityWeapon;
    }

    public Weapon getEntityWeapon() {
        return entityWeapon;
    }

    public void setEntityWeapon(Weapon entityWeapon) {
        this.entityWeapon = entityWeapon;
    }

    public String printInfo(){
        return (this.entityName + " Health:"+this.health+" Damage:"+this.damage+" Weapon Is:"+this.entityWeapon.getWeaponName());
    }
}
