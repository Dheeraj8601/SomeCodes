import java.util.*;
public class sum_of_natural_numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n =sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++){
           //sum =sum+i;
           sum +=i;
        }
        System.out.println("sum of first "+n+" natural numbers is "+sum);
    }
}
