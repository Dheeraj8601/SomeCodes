import java.util.HashMap;

class LongestDistinctSubstring {
    static String longestSubstrDistinctChars(String S) {
        int n = S.length();
        int maxLength = 0;
        int start = 0;
        int longestStart = 0;
        int longestEnd = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = S.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestStart = start;
                longestEnd = end;
            }
        }

        return S.substring(longestStart, longestEnd + 1);
    }

    static int maxLengthDistinctChars(String S) {
        int n = S.length();
        int maxLength = 0;
        int start = 0; // Start index of the current substring
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = S.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // If the character is already in the current substring, update the start index
                // to the next position of the repeated character
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the character's last index
            charIndexMap.put(currentChar, end);

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "geeksforgeeks";
          System.out.println("String : "+input1);
        System.out.println("Longest Distinct substring in ' "+input1+" ' is : "+longestSubstrDistinctChars(input1)); // Output: "eksforg"
        System.out.println("Length : "+maxLengthDistinctChars(input1));
/*
        String input2 = "aaa";
        System.out.println(longestSubstrDistinctChars(input2)); // Output: "a"
        System.out.println(maxLengthDistinctChars(input2));*/
    }
}
