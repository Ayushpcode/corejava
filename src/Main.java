// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        print("Enter the number : ");
        int number = in.nextInt();
        int fact = 1 , i;
        for (i=1 ; i<=number ; i++){
            fact = fact*i;
        }
        print("The Factorial number of " + number + " is " + fact);
   }
   public static void print(String message){
       System.out.print(message);
   }
}