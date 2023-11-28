package gfg;

public class Rotate_array_with_less_time {

    public static void reverse(int a[], int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void leftRotate(int a[],int si,int li, int d) {
        int n = li;
        if (d == 0 || d == n) {
            return;
        }

        reverse(a, 0, d-1);
        reverse(a, d, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void printArray(int a[], int n) {
        System.out.println("The Rotated Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = a.length;
        int d = 2;

        leftRotate(a,0,n, d);
        printArray(a, n);
    }
}
