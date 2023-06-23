import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("enter the number : ");
        int number = in.nextInt();
        reverseNumber(number);
    }
    public static void reverseNumber(int number){
        int reverse  = 0, remainder;
        while (number!=0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        print(" The reverse number is "+ reverse);

    }
    public static void print(String message){
        System.out.print(message);
    }
}
