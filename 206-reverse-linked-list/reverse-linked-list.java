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
    public ListNode reverseList(ListNode head) 
    {
        
     ListNode end=head,start=null;
     while(end!=null)
     {
        ListNode temp=end.next;
        end.next=start;
        start=end;
        end=temp;
     }
     return start;

    }
}