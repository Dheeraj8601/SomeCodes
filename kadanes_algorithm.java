class Solution {
    long maxSubarraySum(int arr[], int n) {
        long maxSum = arr[0];
        long currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            long k=currentSum+arr[i];
            currentSum = Math.max(arr[i], k);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}



