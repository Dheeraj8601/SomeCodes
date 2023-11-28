public class binarySearchExample2 {
    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                return middle; // Element found
            }

            if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        BinarySearchExample binarySearchExample = new BinarySearchExample(); // Create an instance
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int index = binarySearchExample.binarySearch(sortedArray, target); // Call as an instance method

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

