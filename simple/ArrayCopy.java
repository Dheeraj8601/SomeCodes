import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(originalArray, 3);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(newArray));
    }
}
