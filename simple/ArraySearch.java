import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8};
        int key = 5;

        int index = Arrays.binarySearch(numbers, key);

        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found");
        }
    }
}
