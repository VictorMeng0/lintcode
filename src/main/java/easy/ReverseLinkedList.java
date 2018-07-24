package easy;

public class ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null||head.next == null) return head;
        ListNode pre = head;
        ListNode next = head.next;
        pre.next = null;
        while(next!=null){
            ListNode tmp = next.next;
            next.next = pre;
            pre = next;
            next = tmp;
        }
        return pre;
    }
}
