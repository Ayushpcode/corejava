package ABS_ANIMAL;

public class Execution {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        d1.move();
        Cat c1 = new Cat();
        c1.makeSound();
        c1.move();
        Birds b1 = new Birds();
        b1.makeSound();
        b1.move();
    }
}
