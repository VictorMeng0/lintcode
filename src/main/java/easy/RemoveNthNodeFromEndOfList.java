package easy;

/**
 * Created by menghan on 2018/7/26.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode fast = head;
        ListNode slow = newHead;
        while(n-->0)
            fast = fast.next;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return newHead.next;
    }

}
