public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode four = new ListNode(4, null);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        ListNode exampleOne = solution.reverseList(head);

        System.out.println("Example One : ");
        while (exampleOne != null) {
            System.out.print(exampleOne.val + " ");
            exampleOne = exampleOne.next;
        }
    }
}
