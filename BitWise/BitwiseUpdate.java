import java.util.*;

public class BitwiseUpdate {
    public static void main(String args[]){
        int n = 5;
        int pos =1 ;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which one two update 0 or 1 :");
        int opn = sc.nextInt();
        System.out.println();
        int bitMask = 1 << pos;
        if(opn == 1){
         
         int updated = bitMask | n ;
         System.out.println("updated "+updated);
        }
        else{
            int updated = (~(bitMask)) & n ;
            System.out.println("updated "+updated); 
        }
        
    }
}
