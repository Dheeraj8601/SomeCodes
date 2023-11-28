import java.util.*;
public class input_using_scanner {
    public static void main(String args[]){
    Scanner  sc=new Scanner(System.in);
    System.out.println("Enter name : ");
    String name = sc.next();
    System.out.println(name);
    sc.close();
    }
}
