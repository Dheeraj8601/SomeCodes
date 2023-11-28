public class DoublyLinkedList {
    Node head;
    Node tail;
    private int size;

    DoublyLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    // Add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Other methods (printlist, deleteFirst, deleteLast, getSize, reverseIterate, reverseRecursive)

    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addLast("good");
        dll.addLast("morning");
        dll.addLast("!");

        //dll.printlist();

        System.out.println();
       // dll.reverseIterate();
        //dll.printlist();

        //int s = dll.getSize();
        System.out.println();
       // System.out.println("Size is = " + s);
       // dll.printlist();

        // dll.deleteFirst();
        // System.out.println();
        // dll.printlist();
        // dll.deleteLast();
        // System.out.println();
        // dll.printlist();

        // int p = dll.getSize();
        // System.out.println();
        // System.out.println("Size is = " + p);
        // dll.printlist();
    }
}
