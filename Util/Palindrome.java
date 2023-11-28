public class Palindrome {
    
        public static void main(String[] args) {
            Solution solution = new Solution();
    
            String str1 = "racecar";
            String str2 = "a man a plan a canal panama";
            String str3 = "hello";
            // String strk=str2.toUpperCase();
            // System.out.println(strk);
    
            int result1 = solution.isPalindrome(str1);
            int result2 = solution.isPalindrome(str2);
            int result3 = solution.isPalindrome(str3);
    
            System.out.println("Is '" + str1 + "' a palindrome? " + (result1 == 1));
            System.out.println("Is '" + str2 + "' a palindrome? " + (result2 == 1));
            System.out.println("Is '" + str3 + "' a palindrome? " + (result3 == 1));
    }
}
    
class Solution {
    int isPalindrome(String S) {
       int left=0;
        int right=S.length()-1;
        while(left<right){
            if(S.charAt(left)!=S.charAt(right)){
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
}
