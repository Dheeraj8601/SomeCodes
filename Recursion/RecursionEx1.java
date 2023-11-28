
// public class RecursionEx1{
//     public static int sumnumber(int n,int sum){
//        if(n==0){
//         return sum;
//        }
//        else{
//         return sumnumber(n-1, sum+n);
//        }
//     }
//     public static void main(String args[]){
//         int n =6;
//         int sum = 0;
//         int k = sumnumber(n,sum);
//         System.out.println("sum = "+k);
//     }
// }


public class RecursionEx1{
    public static int sumnumber(int n){
       if(n==0){
        return 0;
       }
       else{
        return n+sumnumber(n-1);
       }
    }
    public static void main(String args[]){
        int n =6;
        int sum = 0;
        int k = sumnumber(n);
        System.out.println("sum = "+k);
    }
}

//Both code were correct