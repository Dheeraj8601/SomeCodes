import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sum_diff_product_div {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of b: ");
        int b = Integer.parseInt(br.readLine());
        int sum =a+b;
        int diff =(a-b);
        int product =a*b;
        int div =a/b;

        System.out.println("The result of a="+a+" and b="+b+"\nSum = "+sum+"\nDifference = "+diff+"\nProduct ="+product+"\nDivision = "+div);
    }
}
