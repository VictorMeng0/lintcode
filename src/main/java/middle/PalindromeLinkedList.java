package middle;

import easy.ListNode;

/**
 * Created by menghan on 2018/8/21.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // write your code here
        if(head==null||head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode midHead = reverse(tmp);
        while(head!=null&&midHead!=null){
            if(head.val!=midHead.val) return false;
            head = head.next;
            midHead = midHead.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
