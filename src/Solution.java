public class Solution {
    public ListNode reverseList(ListNode head) {
        // node to be returned
        ListNode prev = null;

        // iterate through linked list
        while (head != null) {
            // placeholder used for new head
            ListNode next = head.next;
            head.next = prev;

            // swapping the nodes places
            prev = head;
            head = next;
        }
        return prev;
    }
}
