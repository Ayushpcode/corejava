package Animal_Inheritance;

public class Mammals extends Animal{


    public Mammals(String name, int age, String gender) {
        super(name, age, gender);
    }
    public void makeSound(){
        System.out.println("roah");
    }
}

