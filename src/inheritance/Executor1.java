package inheritance;

public class Executor1 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1 . setType("Labrador");
        d1 .setSize(57);
        d1 . setWaight(58.6);
        d1 . setEarShape("prick");
        d1 . setTailShape("long");
        d1 . move("30 miles per hour");
        d1 . makesNoise("bho bho");
        d1 . run();
        d1 .bark();
        d1 .walk();
        d1 .wagTail();
        System.out.println(d1 . toString());

        Fish f1 = new Fish(2,4);
        f1 . setType("Catfish");
        f1 . setSize(1.2);
        f1 . setWaight(37.00);
        f1 . moveMusles();
        f1 . movingBackFins();
        f1 . move("dhere dhere");
        f1 . makesNoise("gup gup gup");
        System.out.println(f1.toString());


    }
}
