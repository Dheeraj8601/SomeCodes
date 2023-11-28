
//     import java.util.Scanner;

// class anotg {
//     public static void main(String args[]){
//         System.out.print("enter array size n : ");
//         Scanner sc=new Scanner(System.in);
//         int n=8;//sc.nextInt();
//         /*System.out.println();
//         System.out.print("enter rotation d :");
//         int d=sc.nextInt();
//         System.out.println();*/
//         //System.out.print("Enter array :");
//         int arr[]={15,-2,2,-8,1,7,10,23};
//         /*for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }*/
//        System.out.println(maxLen(arr,n));
//     }
//     static int maxLen(int arr[], int n)
//     {
//         // Your code here
//         int count = 0;
//         for(int i=0;i<n;i++){
//              count = 0;
//             int k=countOfSubarray(arr,i,n,count);
//             if(k!=0){
//                 return k;
//             }
//         }
//         return 0;
//     }
//     static int countOfSubarray(int arr[],int index,int n,int count){
//         int sum=0;
//         for(int i=index;i<n;i++){
//             sum += arr[i];
//             count++;
//         }
//         if(sum==0){
//             return count;
//         }
//         return 0;
//     }
    
// }


class anotg {
    public static void main(String args[]) {
        int n = 8;
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr, n));
    }

    static int maxLen(int arr[], int n) {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int k = countOfSubarray(arr, i, n, count);
            if (k != 0) {
                maxLength = Math.max(maxLength, k);
            }
        }
        return maxLength;
    }

    static int countOfSubarray(int arr[], int index, int n, int count) {
        int sum = 0;
        for (int i = index; i < n; i++) {
            sum += arr[i];
            count++;
            if (sum == 0) {
                return count;
            }
        }
        return 0;
    }
}
