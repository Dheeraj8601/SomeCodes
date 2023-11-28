import java.util.Scanner;

class Easy {
    public static void main(String args[]){
        System.out.print("enter array size n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        System.out.print("enter rotation d :");
        int d=sc.nextInt();
        System.out.println();
        System.out.print("Enter array :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotateArr(arr, d, n);
    }
    static void rotateArr(int arr[], int d, int n) {
        int[] a = new int[n];
        int temp = 0;
        for (int i = 0; i < n - d; i++) {
            a[i] = arr[i + d];
            temp++;
        }
        int q = 0;
        for (int i = temp; i < n; i++) {
            a[i] = arr[q++];
            if (q >= d) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
