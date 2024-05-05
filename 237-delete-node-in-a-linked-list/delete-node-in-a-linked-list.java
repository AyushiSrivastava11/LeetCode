/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        node.val=node.next.val;
        ListNode store=node.next.next;
        node.next.next=null;
        node.next=store;
    }
}