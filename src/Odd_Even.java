import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        print("Enter the Number : ");
        int num = in.nextInt();
        checkNumber(num);
    }
    public static void checkNumber(int number){
        if(number % 2 == 0){
            print("Even Number");
        }else{
            print("Odd Number");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
