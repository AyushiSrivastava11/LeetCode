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

 /*
class Solution {
    public ListNode[] reverseBetween(ListNode root, int left, int right) 
    {
        ListNode current=root;
        int c=1;
        while(current != null)
        {
            current=current.next;
            c++;
        }
        ListNode cur= root;
        int countLeft=1,countRight;
        while(cur.val != left)
        {
            cur=cur.next;
            countLeft++;
        }
        ListNode nextTarget;
        if(left == right)
        {
            nextTarget=cur;
            countRight=countLeft;
        }
        else if(left < right)
        {
            nextTarget = cur.next;
            countRight=countLeft+1;
        while(nextTarget.value != right)
        {
            nextTarget=nextTarget.next;
            countRight++;
        }

        while(countLeft<=countRight)
        {
        int temp= cur.value;
        cur.value=nextTarget.value;
        nextTarget.value=temp;
        countLeft++;
        countRight--;
        }
       
        }
        ListNode[] ans =new ListNode[c];
        for(int i=0;i<c;i++)
        {
            ans[i]=root.next;
        }
       
    }
}
*/

// class Solution {
//     public ListNode[] reverseBetween(ListNode root, int left, int right) {
       
//         int c = 0;
//         ListNode current = root;
//         while (current != null) {
//             current = current.next;
//             c++;
//         }
        
//         ListNode cur = root;
//         int countLeft = 1;
//         while (cur.val != left) {
//             cur = cur.next;
//             countLeft++;
//         }
        
//         ListNode nextTarget;
//         int countRight = countLeft; 
//         if (left != right) {
//             nextTarget = cur.next;
//             countRight++;
//             while (nextTarget.val != right) {
//                 nextTarget = nextTarget.next;
//                 countRight++;
//             }
//         } else {
//             nextTarget = cur; 
//         }
        
//         ListNode prev = null;
//         ListNode currentReverse = cur;
//         while (countLeft <= countRight) {
//             ListNode next = currentReverse.next;
//             currentReverse.next = prev;
//             prev = currentReverse;
//             currentReverse = next;
//             countLeft++;
//         }
        
//         if (countLeft == 2) {
//             root = prev;
//         } else {
//             cur.next = prev;
//         }
        
//         ListNode[] ans = new ListNode[c];
//         current = root;
//         int i = 0;
//         while (current != null) {
//             ans[i] = current;
//             current = current.next;
//             i++;
//         }
        
//         return ans;
//     }
// }

class Solution {

    // Object level variables since we need the changes
    // to persist across recursive calls and Java is pass by value.
    private boolean stop;
    private ListNode left;

    public void recurseAndReverse(ListNode right, int m, int n) {

        // base case. Don't proceed any further
        if (n == 1) {
            return;
        }

        // Keep moving the right pointer one step forward until (n == 1)
        right = right.next;

        // Keep moving left pointer to the right until we reach the proper node
        // from where the reversal is to start.
        if (m > 1) {
            this.left = this.left.next;
        }

        // Recurse with m and n reduced.
        this.recurseAndReverse(right, m - 1, n - 1);

        // In case both the pointers cross each other or become equal, we
        // stop i.e. don't swap data any further. We are done reversing at this
        // point.
        if (this.left == right || right.next == this.left) {
            this.stop = true;            
        }

        // Until the boolean stop is false, swap data between the two pointers
        if (!this.stop) {
            int t = this.left.val;
            this.left.val = right.val;
            right.val = t;

            // Move left one step to the right.
            // The right pointer moves one step back via backtracking.
            this.left = this.left.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        this.left = head;
        this.stop = false;
        this.recurseAndReverse(head, m, n);
        return head;
    }
}
