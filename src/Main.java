public class Main {
    public static void main(String[] args) {
        int[] array = {98, 2, 69, 4, 5, 56, 78, -8, 9, 10};
        int min = array[0];
        int index=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
               index = i;
                min = array[i];
            }
        }
        System.out.println("index value is "+index);
        System.out.println("value is" + min);
    }
}


