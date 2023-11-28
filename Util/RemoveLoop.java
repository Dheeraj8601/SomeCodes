public class RemoveLoop {
    
        static class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        public static void main(String[] args) {
            // Create a sample linked list with a loop
            Node head = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);
    
            head.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node3; // Creating a loop from node5 to node3
    
            // Detect and print the starting node of the loop
            Node loopStart = findFirstNode(head);
            if (loopStart != null) {
                System.out.println("Loop starts at node with data: " + loopStart.data);
            } else {
                System.out.println("No loop found in the linked list.");
            }
    
            // Remove the loop
            removeLoop(head);
    
            // Check if the loop is removed
            loopStart = findFirstNode(head);
            if (loopStart != null) {
                System.out.println("Loop starts at node with data: " + loopStart.data);
            } else {
                System.out.println("No loop found in the linked list.");
            }
        }
    
        // Detect whether the loop exists
        public static Node detectCycle(Node head) {
            Node slow = head;
            Node fast = head;
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return slow;
            }
            return null;
        }
    
        // Find where the loop starts
        public static Node findFirstNode(Node head) {
            Node start = head;
            Node meet = detectCycle(head);
            if (meet == null) return null;
            while (start != meet) {
                start = start.next;
                meet = meet.next;
            }
            return meet;
        }
    
        // Removing loop main function
        public static void removeLoop(Node head) {
            if (head == null) return;
            Node meet = findFirstNode(head);
            if (meet == null) return;
            Node previous = meet;
            while (previous.next != meet) previous = previous.next;
            previous.next = null;
        }
    }
   
    
    /*
     class Solution
{
    // detect whether the loop exist
      public static Node detectCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
             if(slow==fast) return slow;
        }
        return null;
       
    }
    
    //Find where the loop starts
    public static Node findFirstNode(Node head){
        //code here
        
        Node start = head;
        Node meet = detectCycle(head);
        if(meet==null) return null;
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return meet;
    }
    // removing loop main function
    public static void removeLoop(Node head){
        if(head==null) return;
       Node meet = findFirstNode(head);
       if(meet==null) return;
       Node previous = meet;
       while(previous.next!=meet) previous=previous.next;
       previous.next=null;
    }

}
     */

