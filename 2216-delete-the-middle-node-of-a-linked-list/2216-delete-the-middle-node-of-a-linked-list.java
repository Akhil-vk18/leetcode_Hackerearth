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
    public ListNode deleteMiddle(ListNode head) {
        
        if (head==null){
            return head;
        }
        ListNode current =head;
        int length =0,mid,count=1;
        while(current!=null){
            length++;
            current = current.next;
        }
        if(length==1){
            return head.next;
        }
        current =head;
        mid=(length+1)/2;
    if(length%2==0) mid++;
        while(head!=null && count<mid-1){
current =current.next;
count++;
        }
        current.next = current.next.next;
        return head;
    }
}