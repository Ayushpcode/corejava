// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Enter the Celsius : ");
        float celsius = in.nextFloat();
        float fahrenheit ;
        fahrenheit = (celsius * 9/5) + 32;
        print("The fahrenheit is " + fahrenheit);
    }
   public static void print(String message){
       System.out.print(message);
   }
}