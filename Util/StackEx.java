import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
try{
        int topElement1 = stack.peek();
        System.out.println("Top Element: " + topElement1);
        System.out.println("Stack after peek: " + stack);
}catch(EmptyStackException e){
    e.printStackTrace();
}
finally{
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        System.out.println("Stack after peek: " + stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Search for an element in the stack (returns the 1-based position)
        int searchElement = 2;
        int position = stack.search(searchElement);
        if (position != -1) {
            System.out.println(searchElement + " found at position " + position);
        } else {
            System.out.println(searchElement + " not found in the stack");
        }
    }
    }
}
