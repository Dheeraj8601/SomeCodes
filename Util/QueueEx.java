import java.util.LinkedList;

public class QueueEx {
    public static void main(String[] args) {
        // Create a queue of integers using a LinkedList
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue elements into the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Dequeue an element from the front of the queue
        int dequeuedElement = queue.remove();
        System.out.println("Dequeued Element: " + dequeuedElement);
        System.out.println("Queue after dequeue: " + queue);

        // Peek at the front element without removing it
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
        System.out.println("Queue after peek: " + queue);



        int size1 = queue.size();
        System.out.println("size: " + size1);
        System.out.println("Queue after size: " + queue);

        // Check the last inserted element (most recently enqueued)
        int lastInsertedElement = /*((LinkedList<Integer>) queue)*/queue.getLast();
        System.out.println("Last Inserted Element: " + lastInsertedElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);
    }
}
