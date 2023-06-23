import java.util.Scanner;

public class Fact_All_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("enter the number : ");
        int number = in.nextInt();
        factAll(number);
    }
    public static void factAll(int number){
        int fact = 1;
        for (int j = 1; j <= number; j++){
            fact = fact *j;
            print("Factorial of "+ j + " is " + fact);

        }
    }
    public static void print(String message){
        System.out.println(message);
    }
}
