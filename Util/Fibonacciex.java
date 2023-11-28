public class Fibonacciex {
    public static void main(String args[]){
        int n=9;
        int a=0,b=1;
        printfib(n,a,b);
    }
    public static void printfib(int n,int fe,int se){
        int k;
        
        k =fe+se;
        n--;
        if(n==0){
            System.out.println(fe);
            return;
        }
        printfib(n, se, k);

    }
}
