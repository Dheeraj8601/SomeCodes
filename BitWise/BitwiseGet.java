public class BitwiseGet {
    public static void main(String args[]){
        int n = 8;
        int pos =2 ;
        int bitMask = 1 << pos;

        if((n & bitMask)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}
