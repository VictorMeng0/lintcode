package middle;

import easy.ListNode;

/**
 * Created by menghan on 2018/8/6.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // write your code here
        if(head==null||head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
