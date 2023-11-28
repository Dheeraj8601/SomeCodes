import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        String[] namesArray = {"Alice", "Bob", "Charlie"};
        List<String> namesList = Arrays.asList(namesArray);

        System.out.println(namesList);
    }
}
