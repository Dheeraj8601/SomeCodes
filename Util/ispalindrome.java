class Solution {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to check whether the list is palindrome.
    boolean isPalindrome(ListNode head) {
        // Convert the linked list to a string.
        StringBuffer sb = new StringBuffer();
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            current = current.next;
        }
        String linkedListAsString = sb.toString();

        // Use the palindrome logic for strings.
        int left = 0;
        int right = linkedListAsString.length() - 1;
        while (left < right) {
            if (linkedListAsString.charAt(left) != linkedListAsString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
