public class LinkedListEx {
    Node head;
    private int size;

    LinkedListEx(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add-first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode != null){
            System.out.print(currentNode.data +" -> ");
            currentNode= currentNode.next;
        }
        System.out.print("null");
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next !=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        //newNode=currentNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //size
    public int getSize(){
        return size;
    } 

    //reverse
    public void reverseIterate(){
        if(head==null || head.next ==null){
            return;
        }
        Node preNode = head;
        Node currentNode = head.next;
        while(currentNode !=null){
            Node newNode = currentNode.next;
            currentNode.next=preNode;

            //update
            preNode = currentNode;
            currentNode=newNode;
        }
        head.next=null;
        head = preNode;
    }

    //reverse_recursive
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public static void main(String args[]){
        LinkedListEx ll=new LinkedListEx();

        ll.addLast("good");
        ll.addLast("morning");
        
        //ll.printlist();
        ll.addLast("!");
        ll.printlist();

        // System.out.println();
        // ll.reverseIterate();
        // ll.printlist();
        System.out.println();
        ll.head = ll.reverseRecursive(ll.head);    
        ll.printlist();

        int s=ll.getSize();
        System.out.println();
        System.out.println("size is = "+s);
        ll.printlist();
        ll.deleteFirst();
        System.out.println();
        ll.printlist();
        ll.deleteLast();
        System.out.println();
        ll.printlist();
        int p=ll.getSize();
        System.out.println();
        System.out.println("size is = "+p);
        ll.printlist();

        

        



    }
}
