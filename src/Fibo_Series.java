import java.util.Scanner;

public class Fibo_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Enter the number : ");
        int number = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 ;
        print(" " + num1 + " "+ num2 );
        for (int i = 0 ; i < number ; i++){
            num3 = num1 + num2;
            print(" "+ num3);
            num1 = num2;
            num2 = num3;
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
