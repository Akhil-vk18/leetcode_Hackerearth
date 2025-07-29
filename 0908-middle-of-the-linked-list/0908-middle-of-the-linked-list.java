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
    public ListNode middleNode(ListNode head) {
        
        if (head==null){
            return head;
        }
        ListNode current =head;
        int length =0,mid,count=1;
        while(current!=null){
            length++;
            current = current.next;
        }
        current =head;
        mid=(1+length)/2;
        if(length%2==0) mid++ ;
        while(head!=null && count<mid){
current =current.next;
count++;
        }
        return current;
    }
}