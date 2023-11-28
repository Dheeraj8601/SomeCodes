import java.util.*;
public class Sum {
    public static void main(String args[]){
    Scanner  sc=new Scanner(System.in);
    System.out.println("Enter a : ");
    float a = sc.nextFloat();
    System.out.print("Enter b :");
    float b =sc.nextFloat();
    float Sum =a+b;
    System.out.println("Sum of "+a+" and "+b+" is "+Sum);
    sc.close();
    }
}
