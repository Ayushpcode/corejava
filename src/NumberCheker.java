public class NumberCheker {
    public static void main(String[] args) {
        checkNumber(1);
    }
    public static void checkNumber(int number){
        if(number > 0){
            print("Positive");
        } else if (number < 0) {
            print("Nagative");
        }else {
            print("zero");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
