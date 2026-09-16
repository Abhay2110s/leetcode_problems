class Solution {
    public ListNode doubleIt(ListNode head) {
        int carry = solve(head);

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    private int solve(ListNode node) {
        if (node == null) {
            return 0;
        }

        int carry = solve(node.next);

        int value = node.val * 2 + carry;

        node.val = value % 10;

        return value / 10;
    }
}