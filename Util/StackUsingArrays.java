
 import java.util.*;
 public class StackUsingArrays {
    public static class Stack{
        
            private int size;
            private int[] array;
            private int top;

            Stack(int size){
                this.size=size;
                this.array=new int[size];
                this.top=-1;
            }
        
        
        public  boolean isEmpty(){
            return top==-1;
        }
        public  boolean isFull(){
            return top==(size-1);
        }
        public  void push(int data){
            if(isFull()){
                System.out.println("Stack Overflow");
            }
            array[++top]=data;
        }
        public  int pop(){
            if(isEmpty()){
                System.out.println("stack underflow");
                return -1;
            }
             return array[top--];
             
        }
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return array[top];
        } 
        public  void display(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("[ ");
            for(int i=size-1;i>=0;i--){
                System.out.print(array[i]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String args[]){
        Stack st=new Stack(5);
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


