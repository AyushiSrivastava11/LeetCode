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
    public ListNode mergeNodes(ListNode head) 
    {

     //First we will point to the first 0 we are encountering
     //Second we lead to nodes that are non-zero
     //Thirdly we store the prev.next links
     //We will also check if there is a Null as next [0|Null]
     ListNode first=head;
     ListNode second=first.next;
     //basecase
     int sum=0;

     
     while ( second.next != null)
     {
        
     if(second.val==0)
       {
        first.val=sum;
        sum=0;
        first.next=second;
        first=second;
       }
       else
       {
        sum+=second.val;
        // ListNode temp=second.next;
       }
       second=second.next;
     }
     
        first.val=sum;
        first.next=null;
        return head;
    }
}