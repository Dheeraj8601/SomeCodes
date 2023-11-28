import java.util.Stack;

public class StackUsingCollections {
    public static void main(String args[]){
        Stack<Integer> st=new Stack();
        st.push(5);
        st.push(57);
        st.push(54);
        st.push(55);
        st.push(9);
        System.out.println(st);
        int k=st.pop();
        System.out.println(k);
        int k1=st.peek();
        System.out.println(k1);
    }
}
