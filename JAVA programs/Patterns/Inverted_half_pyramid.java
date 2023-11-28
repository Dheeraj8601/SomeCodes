package Patterns;
import java.util.*;
public class Inverted_half_pyramid {
    public static void main(String args[]){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n=d.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
