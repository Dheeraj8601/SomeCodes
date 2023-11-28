import java.util.Scanner;

public class Find_first_Last_index_recursion {
    public static int first=-1;
    public static int last=-1;

    public static void find_last_first_index(String str,int index,char element){
        if(str.length()-1 == index){
            if(first != -1){
            System.out.println("First index of element '"+element+"' is at "+first);
             if(last != -1){
            System.out.println("Last index of element '"+element+"' is at "+last);
            }else{
                System.out.println("Element '"+element+"' is found only once so it's first and last index will be "+first);
            }
        }
            else{
                System.out.println("Element '"+element+"' is not found in the string '"+str+"'");
            }
            return;
        
    }
        char currentChar = str.charAt(index);
        if(currentChar == element){
            if(first==-1){
                first = index;
            }
            else{
                last = index;
            }
        }
        find_last_first_index(str,index+1,element);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = sc.nextLine();
        System.out.print("Enter the element whose first and last index will be searched :");
        char e = sc.next().charAt(0);
        find_last_first_index(str,0,e);
    }
}
