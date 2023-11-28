import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "my-website.com is better than your-website.net";
        String[] words = input.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }
    }

}
//my-website.com is better than your-website.net