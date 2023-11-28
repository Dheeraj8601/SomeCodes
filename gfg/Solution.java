import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void Pattern(int N) {
       
        if (N > 0) {
            //result.add(N);
            System.out.print(N+" ");
            Pattern(N - 5);
        } else if (N <= 0) {
            //result.add(N + 5);
            System.out.print((N+5)+" ");
            Pattern(N + 5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
         Pattern(N);
        
    }
}
