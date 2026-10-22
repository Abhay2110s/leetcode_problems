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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;

        // Count total nodes
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // If the head node needs to be removed
        if (n == count) {
            return head.next;
        }

        // Find the node just before the target
        curr = head;
        for (int i = 1; i < count - n; i++) {
            curr = curr.next;
        }

        // Remove the target node
        curr.next = curr.next.next;

        return head;
    }
}
