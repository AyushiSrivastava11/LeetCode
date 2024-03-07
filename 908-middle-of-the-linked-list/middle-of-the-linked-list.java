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
    public ListNode middleNode(ListNode head) 
    {
        int count=0;
        for(ListNode tmp=head;tmp!=null;tmp=tmp.next)
        {
            count++;
        }
        count=count/2+1;
        ListNode tmp=head;
        while(count>1)
        {
            count--;
            tmp=tmp.next;
        }
        return tmp;
    }
}