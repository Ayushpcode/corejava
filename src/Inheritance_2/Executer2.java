package Inheritance_2;

public class Executer2 {
    public static void main(String[] args) {
        Person firstPerson = new Person("Ayush",20);
        System.out.println(firstPerson.getName());
        System.out.println(firstPerson.getAge());
        System.out.println(firstPerson.toString());
        Person1 secondPerson = new Person1("Kunal",19);
        System.out.println(secondPerson.name());
        System.out.println(secondPerson.age());
        System.out.println(secondPerson.toString());
    }
}
