package middle;

import easy.ListNode;

/**
 * Created by menghan on 2018/8/3.
 */
public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode tmp = new ReverseLinkedListII().reverseBetween(head,2,5);
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        int numTodo = n-m;
        if(m>=n) return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode node = newHead;
        m--;
        n--;
        while(m-->0){
            node = node.next;
        }
        ListNode pre = node.next;
        ListNode readEnd = pre;
        ListNode nxt = pre.next;
        node.next = null;
        pre.next = null;
        while(nxt!=null&&numTodo-->0){
            ListNode tmp = nxt.next;
            nxt.next = pre;
            pre = nxt;
            nxt = tmp;
        }
        node.next = pre;
        readEnd.next = nxt;
        return newHead.next;
    }
}
