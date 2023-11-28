import java.util.*;
public class odd_or_even {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number a :");
    int a=sc.nextInt();
    if(a%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
}
