package middle;

import easy.ListNode;

/**
 * Created by menghan on 2018/8/3.
 */
public class RotateList {
    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(head == null||head.next == null) return head;
        int len = 0;
        ListNode lenTmp = head;
        while(lenTmp!=null){
            len++;
            lenTmp = lenTmp.next;
        }
        k%=len;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(k-->0)
            fast = fast.next;
        if(fast == null) return head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
    }
}
