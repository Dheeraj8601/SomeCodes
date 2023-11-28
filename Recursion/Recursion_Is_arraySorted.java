
import java.util.Scanner;

public class Recursion_Is_arraySorted {
    public static boolean isSorted(int a[],int index){
        if(index == a.length-1){
            return true;
        }
        if(a[index]<a[index+1]){
            return isSorted(a, index+1);
        }
        else return false;
    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter integer values for the array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
    if(isSorted(array,0)){
        System.out.println("Array is sorted");
    }
    else{
        System.out.println("Array is not sorted");
    }
   } 
}
