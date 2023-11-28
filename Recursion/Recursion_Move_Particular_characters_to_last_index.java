import java.util.Scanner;

public class Recursion_Move_Particular_characters_to_last_index {

    public static String newStr= "";

    public static void MoveToLast(String str,int index,int count,char element){
        
        if(index == str.length()-1){

            int i = 0;
            while(i<=count){
                newStr += element;
                i++;
            }
            System.out.println("New String '"+newStr+"' by moving '"+element+"' to last index");

            return;
        }

        char currentChar = str.charAt(index);

        if(currentChar == element){
            count++;
        }
        else
        {
            newStr += currentChar;
        }

        MoveToLast(str, index+1, count, element);

    }
    public static void main(String args[]){

        String str = "abxcxdxxddxabx";

        System.out.print("Enter the character from '"+str+"' to add at last :");
        Scanner sc=new Scanner(System.in);
        char element = sc.next().charAt(0);

        MoveToLast(str,0,0,element);

    }
}
