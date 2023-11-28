import java.util.HashSet;
import java.util.Iterator;

class Solution {
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Element of array: " + arr[i]);
            if (arr[i] > 0) {
                System.out.println("Element entering set: " + arr[i]);
                set.add(arr[i]);
            }
        }

        int sum1 = 0;
        int n = set.size(); // corrected the variable name
        int sum2 = (n * (n + 1)) / 2; // corrected the formula
        System.out.println("Sum of " + n + " natural numbers is " + sum2);

        Iterator<Integer> iterator = set.iterator();
        set.remove(1);
        System.out.println("Set (" + n + ") :");
        while (iterator.hasNext()) {
            int current = iterator.next(); // Call next() only once
            System.out.print(current + " ");
            sum1 += current; // Use the current variable
            System.out.println();
            System.out.println("Sum is: " + sum1);
        }
         

        set.clear();

        if (sum1 == sum2) {
            return n + 1;
        }

        return Math.abs(sum2 - sum1);
    }
}

public class HashSetex {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr2 = {0, -10, 1, 3, -20};
        int size2 = 5;
        System.out.println("Output for arr2: " + s.missingNumber(arr2, size2));
    }
}
