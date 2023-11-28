public class BitwiseClear {
    public static void main(String args[]){
        int n = 5;
        int pos =2 ;
        int bitMask = 1 << pos;

        int notMask = ~bitMask;

        int ans = notMask & n;

        System.out.println(ans);
        
    }
}
