// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
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