import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class qns {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of b: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Enter value for c :");
        int c=Integer.parseInt(br.readLine());

        int result = (a+b+c)*(a+b+c);

        System.out.println("The result is: " + result);
    }
}
