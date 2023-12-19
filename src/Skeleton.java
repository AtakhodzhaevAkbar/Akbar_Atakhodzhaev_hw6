public class Skeleton extends Boss {
    private int arrowsAmmount;

    public Skeleton(int health, int damage, String entityName, Weapon entityWeapon, int arrowsAmmount) {
        super(health, damage, entityName, entityWeapon);
        this.arrowsAmmount = arrowsAmmount;
    }

    public int getArrowsAmmount() {
        return arrowsAmmount;
    }

    public void setArrowsAmmount(int arrowsAmmount) {
        this.arrowsAmmount = arrowsAmmount;
    }

    @Override
   public String printInfo(){
        return super.printInfo()+" Ammount Of Arrows:" + this.arrowsAmmount;
    }
}
