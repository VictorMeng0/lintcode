package middle;

import datastructure.ListBuilder;
import easy.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/21.
 */
public class AddTwoNumbersII {
    public static void main(String[] args) {
        ListNode l1 = ListBuilder.buildList(Arrays.asList(6,1,7));
        ListNode l2 = ListBuilder.buildList(Arrays.asList(2,9,5));
        ListNode head = new AddTwoNumbersII().addLists2(l1,l2);
        ListBuilder.printList(head);

    }

    public ListNode addLists2(ListNode l1, ListNode l2) {
        // write your code here
        ListNode l1Head = reverse(l1);
        ListNode l2Head = reverse(l2);
        ListNode head = new ListNode(-1);
        ListNode newHead = head;
        int add = 0;
        while(l1Head!=null&&l2Head!=null){
            int val = (l1Head.val+l2Head.val+add)%10;
            newHead.next = new ListNode(val);
            newHead = newHead.next;
            add = (l1Head.val+l2Head.val+add)/10;
            l1Head = l1Head.next;
            l2Head = l2Head.next;
        }
        while(l1Head!=null){
            newHead.next = new ListNode((l1Head.val+add)%10);
            newHead = newHead.next;
            add = (l1Head.val+add)/10;
            l1Head = l1Head.next;
        }
        while(l2Head!=null){
            newHead.next = new ListNode((l2Head.val+add)%10);
            newHead = newHead.next;
            add = (l2Head.val+add)/10;
            l2Head = l2Head.next;
        }
        if(add!=0) newHead.next = new ListNode(add);
        return reverse(head.next);
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
