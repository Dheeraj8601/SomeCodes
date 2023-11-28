import java.util.*;
public class do_while_table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n =sc.nextInt();
        int i=0;
        int sum=0;
        System.out.println("The table of "+n+" is :");
        do{
         i++;
         sum =n*i;
         System.out.println(n+" * "+i+" = "+sum);
        }while(i<20);

    }
}
