import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class circle {
    public static void main(String args[]) throws IOException{
        Float pi =3.14f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value for radius of circle(R) : ");
        Float R = Float.parseFloat(br.readLine());
        Float Circumference = 2*pi*R;
        Float Area = pi*R*R;
        
        System.out.print("Circumference and Area of circle of radius "+R+" are "+Circumference+" and "+Area+"respectively");
    }
}
