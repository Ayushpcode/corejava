import java.util.Scanner;

public class Sum_Of_Even_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("enter the number : ");
        int number = in.nextInt();
        int sum = 0 ;
        for (int i = 0 ; i <= number; i++){
            if( i % 2 == 0){
                sum = sum + i ;
            }
        }
        print("the sum of all even number upto "+ number  + " is " + sum);
    }
    public static void print(String message){
        System.out.print(message);
    }
}
