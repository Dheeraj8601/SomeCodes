import java.util.*;
public class condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of person :");
        String name=sc.nextLine();
        System.out.println("Enter age of "+name+" : ");
        int age=sc.nextInt();
        if(age>18){
            System.out.println(name+" is adult.");
        }
        else{
            System.out.println(name+" is not  adult");
        }
    }
}
