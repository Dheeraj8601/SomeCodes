public class StackExample {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode =new  Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public static int pop(){
            int top=head.data;
            if(isEmpty()){
                return -1;
            }
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public static void display(){
            if(isEmpty()){
                System.out.println("Stack Underflow");
            }
            System.out.print("[");
            Node current=head;
            while(current !=null){
                
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.print("]");
            System.out.println();
        } 
     }
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(5);
        st.push(57);
        st.push(54);
        st.push(55);
        st.push(9);
        st.display();
        int k=st.pop();
        System.out.println(k);
        int k1=st.peek();
        System.out.println(k1);
    }
}
