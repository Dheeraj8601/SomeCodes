/*import java.util.Scanner;

public class ReverseRecursion {
    public static void Reverse(String str,int index){
        if(index==0){
             System.out.print(str.charAt(index));
             return;
        }
        System.out.print(str.charAt(index));
        Reverse(str,index-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        System.out.println();
        Reverse(str,str.length()-1);
    }
}*/

public class ReverseRecursion{
    static String newStr ="";
    public static void main(String args[]){
        String str="abcd";
        int n=str.length()-1;
        String a=Reverse(str,n);
        System.out.println(a);
    }
    public static String Reverse(String str,int index){
        if(index==0){
            newStr +=str.charAt(index);
            return newStr;
        }
         newStr += str.charAt(index);
        Reverse(str,index-1);



    }
}

/*public class ReverseRecursion {
    static String newStr = "";

    public static void main(String args[]) {
        String str = "abcd";
        int n = str.length() - 1;
        String a = Reverse(str, n);
        System.out.println(a);
    }

    public static String Reverse(String str, int index) {
        if (index == 0) {
            newStr += str.charAt(index);
            return newStr;
        }
        newStr += str.charAt(index);
        return Reverse(str, index - 1);
    }
}
*/
