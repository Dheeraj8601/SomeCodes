import java.util.*;
public class condition_using_boolean {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of person :");
        String name=sc.nextLine();
        System.out.println("Enter age of "+name+" : ");
        int age=sc.nextInt();
        boolean isAdult = age > 18;
        if(isAdult){
            System.out.println(name+" is adult.");
        }
        else{
            System.out.println(name+" is not adult.");
        }
    }
}
