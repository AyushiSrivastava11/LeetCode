class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        ListNode dummy = new ListNode(0); // Dummy node to simplify insertion
        ListNode current = head; // Pointer to traverse the original list

        while (current != null) {
            ListNode nextNode = current.next; // Save the next node before disconnecting it

            // Find the correct position to insert the current node in the sorted list
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert the current node into the sorted list
            current.next = prev.next;
            prev.next = current;

            // Move to the next node in the original list
            current = nextNode;
        }

        return dummy.next; // Return the sorted list (excluding the dummy node)
    }
}
