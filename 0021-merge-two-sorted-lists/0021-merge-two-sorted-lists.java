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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode current =head;
        if(list1==null){
            return list2;
        }
          if(list2==null){
            return list1;
        }
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }
            else{
           current.next=list2;
                
              list2=list2.next;
            }
            current=current.next;
        }
        while(list1!=null){
            current.next=list1;
            list1=list1.next;
                 current=current.next;
        }
        while(list2!=null){
                  current.next = list2;
                current=current.next;
              list2=list2.next;
        }
        return head.next;
    }
}