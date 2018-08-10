package middle;

import easy.ListNode;

/**
 * Created by menghan on 2018/8/10.
 */
public class ReorderList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        new ReorderList().reorderList(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public void reorderList(ListNode head) {
        // write your code here
        if(head == null||head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode newHead = reverse(tmp);
        ListNode mark = head;
        while (newHead!=null){
            ListNode cache = mark.next;
            mark.next = newHead;
            ListNode mark2 = newHead.next;
            newHead.next = cache;
            mark = cache;
            newHead = mark2;
        }

    }

    public ListNode reverse(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode pre=head;
        ListNode nxt=head.next;
        pre.next=null;
        while(nxt!=null){
            ListNode tmp=nxt.next;
            nxt.next=pre;
            pre=nxt;
            nxt=tmp;
        }
        return pre;
    }
}
