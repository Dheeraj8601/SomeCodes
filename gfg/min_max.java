import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int MIN, MAX;

        for (int i = 0; i < n - 1; i++) {
            MIN = Math.min(smallest, arr[i + 1] - k);
            MAX = Math.max(largest, arr[i] + k);
            if (MIN < 0) {
                continue;
            }
            ans = Math.min(ans, MAX - MIN);
        }
        return ans;
    }
}

public class min_max {
    public static void main(String args[]) {
        int a[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int n = 10, k = 5;

        Solution solution = new Solution();
        int minDiff = solution.getMinDiff(a, n, k);
        
        System.out.println("Minimum Difference: " + minDiff);
    }
}
