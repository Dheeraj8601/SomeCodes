package Patterns;
import java.util.*;

public class half_pyramid_with_numbers {
    public static void main(String args[]){
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n=Scanner.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
