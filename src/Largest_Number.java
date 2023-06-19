import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        print("Enter the First Number : ");
        int n1 = in.nextInt();
        print("Enter the Second Number : ");
        int n2 = in.nextInt();
        print("Enter the Third Number : ");
        int n3 = in.nextInt();
        checkGreaterOne(n1 ,n2, n3);
    }
    public static void checkGreaterOne(int Number1 , int Number2 , int Number3){
        if(Number1 > Number2){
            if(Number1 > Number3){
                print(Number1 + " is greater one. ");
            }
        }else if(Number2 > Number3){
            print(Number2 + " is greater one.");
        }else{
            print(Number3 + " is greator one.");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
