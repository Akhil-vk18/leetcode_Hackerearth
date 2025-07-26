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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode head = sum;
        int val, carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            val = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            carry = val / 10;
            head.next = new ListNode(val % 10);
            head=head.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return sum.next;
    }
}