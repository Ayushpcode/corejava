// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
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