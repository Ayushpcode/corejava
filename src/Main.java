// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Enter the number : ");
       int num = in.nextInt();
       int flag = 0 ;
       int sum , i;
       for (i = 1; i <= num; i++){
           if(num % i == 0){
               flag = flag + 1;
           }
       }
       if(flag == 2){
           print(num + " is a prime number .");
       }else{
           print(num + " is a non prime number .");
       }
    }
   public static void print(String message){
       System.out.print(message);
   }
}