package Patterns;
import java.util.*;
public class Inverted_half_pyramid_with_numbers2 {
   public static void main(String args[]){
    Scanner d=new Scanner(System.in);
    System.out.print("Enter n :");
    int n=d.nextInt();
    System.out.println();
    
    for(int i=1;i<=n;i++){
        //int k=1;
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
            
        }
        System.out.println();
    }
   } 
}
