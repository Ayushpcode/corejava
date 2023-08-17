package ABS_EMP;

public class Executive {
    public static void main(String[] args) {
        Manager c1 = new Manager("Aman" , 25 , 500000 , 5000);
        System.out.println("sal cal " + c1.calculateSalary());
        Developer c2 = new Developer("Ayush" , 123 ,50000 , 20);
        System.out.println("hr cal " + c2.calculateSalary());
    }
}
