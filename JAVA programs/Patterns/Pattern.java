public class Pattern {
    public static void main(String args[]) {
        int rowCount = 6;
        char ch = 'A';
        
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ +" ");
               
            }
            System.out.println();
        }
    }
}

