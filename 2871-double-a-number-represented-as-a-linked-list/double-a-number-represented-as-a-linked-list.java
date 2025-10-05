/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        String a = "";
        
        // Build the number string from the linked list
        while (curr != null) {
            a = a + curr.val; // Keep your style
            curr = curr.next;
        }

        // --- Multiply the string number by 2 manually (no overflow) ---
        StringBuilder res = new StringBuilder();
        int carry = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int digit = a.charAt(i) - '0';
            int product = digit * 2 + carry;
            res.append(product % 10);
            carry = product / 10;
        }
        if (carry > 0) res.append(carry);
        res.reverse();

        // --- Build new linked list from the resulting string ---
        ListNode dummy = new ListNode(0);
        ListNode currr = dummy;

        for (int i = 0; i < res.length(); i++) {
            int k = res.charAt(i) - '0';
            ListNode nextt = new ListNode(k);
            currr.next = nextt;
            currr = nextt;
        }

        return dummy.next;
    }
}
