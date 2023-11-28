import java.util.Scanner;

public class NamePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int length = name.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}
