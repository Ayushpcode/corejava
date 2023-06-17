public class Agecheker {
    public static void main(String[] args) {
        checkage(10);
    }
    public static void checkage(int number){
        if(number > 18){
            print("eligible for vote");
        } else {
            print("Not eligible for vote");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
