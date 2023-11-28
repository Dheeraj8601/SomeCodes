import java.util.Arrays;
import java.util.Stack;

public class ArraysSort {
        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 3};
            Arrays.sort(numbers);
    
            //System.out.println("Sorted Array: " + Arrays.toString(numbers));
            System.out.println("Sort by ascending order");
            for(int l:numbers){
                System.out.print(l+" ");
            }
            System.out.println();
            
            Stack<Integer> st=new Stack();
            for(int n:numbers){
                st.push(n);
            }
            int i=0;
            while(!st.isEmpty()){
                numbers[i++]=st.pop();
            }
            System.out.println("Sort by descending order");
            for(int l:numbers){
                System.out.print(l+" ");
            }
        }
    }
    
