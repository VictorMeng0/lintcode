package easy;

public class NthLastInList {
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode fast = head;
        ListNode slow = head;
        while(n-->0) fast = fast.next;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
