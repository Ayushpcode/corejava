public class Vowel {
    public static void main(String[] args) {
        ioVowel('A');

    }
    public static void ioVowel(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U'){
            print("The character is vowel .");
        }else{
            print("The character is constant");
        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}
