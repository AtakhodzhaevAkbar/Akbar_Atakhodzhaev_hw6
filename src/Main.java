public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500,20,"Boss",WeaponType.GREATSWORD);
        System.out.println(boss.printInfo());
        Skeleton skeleton1= new Skeleton(50,20,"Skeleton1",WeaponType.BOW,25);
        System.out.println(skeleton1.printInfo());
        Skeleton skeleton2= new Skeleton(45,15,"Skeleton2",WeaponType.BOW,35);
        System.out.println(skeleton2.printInfo());
    }
}