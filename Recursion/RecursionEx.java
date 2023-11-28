import java.util.*;
public class RecursionEx{
    public static void printnumber(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            printnumber(n-1);
        }
    }
    public static void main(String args[]){
        int n =6;
        printnumber(n);
    }
}