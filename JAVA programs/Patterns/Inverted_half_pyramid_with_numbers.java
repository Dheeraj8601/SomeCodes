package Patterns;
import java.util.*;
public class Inverted_half_pyramid_with_numbers {
   public static void main(String args[]){
    Scanner d=new Scanner(System.in);
    System.out.print("Enter n :");
    int n=d.nextInt();
    System.out.println();
    
    for(int i=1;i<=n;i++){
        int k=1;
        for(int j=n;j>=i;j--){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
    }
   } 
}
