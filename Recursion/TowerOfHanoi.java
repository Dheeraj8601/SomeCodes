import java.util.Scanner;

public class TowerOfHanoi {
    public static void TowerOfHAnoi(int n,char source,char helper,char destination){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        TowerOfHAnoi(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        TowerOfHAnoi(n-1, helper,source,destination);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disk : ");
        int n = sc.nextInt();

        TowerOfHAnoi(n, 'S', 'H', 'D');
    }
}
