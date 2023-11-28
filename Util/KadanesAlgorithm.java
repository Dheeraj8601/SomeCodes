public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] a) {
        int max = 0; 
        int current = 0;

        for (int i = 1; i < a.length; i++) {
           current=current+a[i];
           if(current>max){
            max=current;
           }
           if(current<0){
             current =0;
           }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
