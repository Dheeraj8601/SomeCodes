public class BitwiseSet {
    public static void main(String args[]){
        int n = 5;
        int pos =1 ;
        int bitMask = 1 << pos;

        int newkey = n | bitMask;
        System.out.println(newkey);
    }
}
