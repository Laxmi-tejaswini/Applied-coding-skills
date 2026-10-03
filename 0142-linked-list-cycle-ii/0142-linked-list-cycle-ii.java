public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow,fast,e;
        slow=fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                e=head;
                while(slow!=e){
                    slow=slow.next;
                    e=e.next;
                }
                return e;
            }
        }
        return null;
    }
}