public class Array {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 0, 3, 4, 0};
        moveZerosToOneSide(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveZerosToOneSide(int[] arr) {
        int n = arr.length;
        int count = 0;  // Count of non-zero elements

        // Traverse through the array, move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining elements with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }
}