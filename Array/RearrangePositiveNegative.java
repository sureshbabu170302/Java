import java.util.Arrays;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] array = {5, 0, 3, 8, 0, 9, 2, 0, 1};
        
        // Call the method to sort and move zeros
        sortAndMoveZeros(array);
        
        // Print the result
        System.out.println(Arrays.toString(array));
    }

    private static void sortAndMoveZeros(int[] arr) {
        Arrays.sort(arr); // Sort the array
        
        // Move zeros to the end
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
