import java.util.Scanner;

public class Fahrenheit {
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
