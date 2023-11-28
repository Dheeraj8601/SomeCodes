import java.util.*;
public class AnagramList {
    public static List<List<String>> groupAnagrams(String[] words) {
        
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            
            char[] chars = word.toCharArray();
           
            Arrays.sort(chars);
            
             String sortedWord = new String(chars);
            
           
            if (!anagramMap.containsKey(sortedWord)) {

                anagramMap.put(sortedWord, new ArrayList<>());

            }


            anagramMap.get(sortedWord).add(word);

            
        }
        
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] words = {"ate", "eat", "bat", "cat", "tab", "man"};
        
        List<List<String>> anagramGroups = groupAnagrams(words);

        System.out.println(anagramGroups);
    }
}