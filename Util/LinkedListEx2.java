import java.util.LinkedList;

public class LinkedListEx2 {
    
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the beginning and end
        ll.addFirst("good");
        ll.addFirst("morning");
        ll.addLast("!");

        // Printing the elements
        for (String data : ll) {
            System.out.print(data + " -> ");
        }
        System.out.print("null");
        System.out.println();

        ll.add(1, "beautiful");
        for (String data : ll) {
            System.out.print(data + " -> ");
        }
        System.out.print("null");

        // Getting the size
        int size = ll.size();
        System.out.println("\nSize is = " + size);

        // Deleting the first and last elements
        ll.removeFirst();
        ll.removeLast();

        // Printing the elements again
        System.out.println();
        for (String data : ll) {
            System.out.print(data + " -> ");
        }
        System.out.print("null");

        // Getting the size again
        size = ll.size();
        System.out.println("\nSize is = " + size);
        System.out.println();

        for(String t:ll){
            System.out.print(t +" -> ");
        }
        System.out.print("null");
        ll.remove();
        System.out.println();

        for(String t:ll){
            System.out.print(t +" -> ");
        }
        System.out.print("null");
        ll.add("Sangha");
        System.out.println();

        for(String t:ll){
            System.out.print(t +" -> ");
        }
        System.out.print("null");

        
        for (String data : ll) {
            System.out.print(data + " -> ");
        }
    }
}
