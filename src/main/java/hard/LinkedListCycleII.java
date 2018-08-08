package hard;

import easy.ListNode;

/**
 * Created by menghan on 2018/8/7.
 */
public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        System.out.println(new LinkedListCycleII().detectCycle(head));
    }
    public ListNode detectCycle(ListNode head) {
        // write your code here
        if(head==null||head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if(fast == null||fast.next==null ) return null;
        ListNode tmp = head;
        while(tmp!=slow){
            tmp = tmp.next;
            slow = slow.next;
        }
        return tmp;

    }
}
