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
    public ListNode mergeInBetween(ListNode root, int a, int b, ListNode root2) 
    {
        ListNode list1=root;
        for(int i=1;i<a;i++)
        {
            list1=list1.next;
        }
        ListNode list2=list1;
        for(int i=1;i<=b-a+1;i++)
        {
            list2=list2.next;
        }
        list1.next=root2;
        while(root2.next!=null)
        {
            root2=root2.next;
        }
        root2.next=list2.next;
        return root;

    }
}