public class NamePattern1 {
    public static void main(String[] args) {
        String name = "Dheeraj";
        int length = name.length();
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }

        for (int i = mid; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}

