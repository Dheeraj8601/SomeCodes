import java.util.*;
public class ab {
  public static void main(String args[]) {
    Scanner  sc=new Scanner(System.in);
    System.out.println("Enter a : ");
    float a = sc.nextFloat();
    System.out.print("Enter b :");
    float b =sc.nextFloat();
    if(a==b){
        System.out.println("a and b are equal");
    }
    else if (a>b) {
        System.out.println("a greater than b");
    } else {
        System.out.println("a is lesser than b");
    }
  }  
}
