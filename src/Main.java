public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon=new Weapon(WeaponType.GREATSWORD,"Heroes Slayer");
        Boss boss = new Boss(500,20,"Boss",bossWeapon);
        System.out.println(boss.printInfo());
        Weapon skeletonWeapon=new Weapon(WeaponType.BOW,"Skelet Bow");
        Skeleton skeleton1= new Skeleton(50,20,"Skeleton1",skeletonWeapon,25);
        System.out.println(skeleton1.printInfo());
        Skeleton skeleton2= new Skeleton(45,15,"Skeleton2",skeletonWeapon,35);
        System.out.println(skeleton2.printInfo());
    }
}