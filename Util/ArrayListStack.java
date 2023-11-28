import java.util.*;

public class ArrayListStack {
    public static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
             int top = list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        } 
        public static void display(){
            if(isEmpty()){
                System.out.println("Stack underflow");
            }
            System.out.print("[");
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
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
