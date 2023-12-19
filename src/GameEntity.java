public class GameEntity {
    public int health;
    public int damage;
    public String entityName;


    public GameEntity(int health, int damage, java.lang.String entityName) {
        this.health = health;
        this.damage = damage;
        this.entityName = entityName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public java.lang.String getEntityName() {
        return entityName;
    }

    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }
}
