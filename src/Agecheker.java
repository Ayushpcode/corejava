import java.util.Scanner;

public class Agecheker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Enter the Age Of a candidate :");
        int age = in.nextInt();
        checkage(age);
    }
    public static void checkage(int number){
        if(number > 18){
            print("eligible for vote");
        } else {
            print("Not eligible for vote");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
