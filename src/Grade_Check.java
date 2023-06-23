import java.util.Scanner;

public class Grade_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("enter the number : ");
        int number = in.nextInt();
        gradeNumber(number);
    }
    public static void gradeNumber(int percentage){
        if(percentage > 100 || percentage < 0){
            print("Error! marks should be with 0 to 100 !!");
        }
        else if(percentage>=90){
            print("The grade is A");
        } else if (percentage>=80) {
            print("THe grade is B");
        }else if (percentage>=70){
            print("The grade is C");
        }else if (percentage>=60){
            print("The grade is D");
        }else{
            print("Fail");
        }

    }
    public static void print(String message){
        System.out.print(message);
    }
}
