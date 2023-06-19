import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        print("Enter the year : ");
        int yr = in.nextInt();
        checkYear(yr);
    }
    public static void checkYear(int year){
        if(year % 4 == 0 || year % 400 == 0 || year % 100 == 0 ){
            print("leap year");
        }else{
            print("not a leap year");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
