class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode prevgend = temp;

        while (true) {
            ListNode kth = prevgend;

            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null)
                    return temp.next;
            }

            ListNode gstart = prevgend.next;
            ListNode nextgstart = kth.next;

            ListNode prev = nextgstart;
            ListNode current = gstart;

            while (current != nextgstart) {
                ListNode nextnode = current.next;
                current.next = prev;
                prev = current;
                current = nextnode;
            }

            prevgend.next = kth;
            prevgend = gstart;
        }
    }
}