import java.util.*;

public class while_table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n =sc.nextInt();
        int i=1;
        int sum=0;
        System.out.println("The table of "+n+" is :");
        while(i<=20){
            sum =n*i;
         System.out.println(n+" * "+i+" = "+sum);
         i++;
        }
    }
}
