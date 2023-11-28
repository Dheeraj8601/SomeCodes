import java.util.*;

public class table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n =sc.nextInt();
        int i;
        int sum=0;
        System.out.println("The table of "+n+" is :");
        for(i=1;i<=20;i++){
         sum =n*i;
         System.out.println(n+" * "+i+" = "+sum);
        }
}
}
