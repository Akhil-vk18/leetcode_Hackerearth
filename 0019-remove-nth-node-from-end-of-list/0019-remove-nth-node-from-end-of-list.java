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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        ListNode temp = head;
        int length = 0;
        if (head == null)
            return head;

        while (temp != null) {
            ++length;
            temp = temp.next;

        }
        if (length == n) {
           return head.next;
           
        }
        int pos = length - n;
        int count = 0;
        temp = head;
        while (temp != null && count < pos) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            prev.next = temp.next;
        } else {
            prev.next = null;
        }

        return head;
    }
}