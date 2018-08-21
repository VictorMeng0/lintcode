package middle;

import datastructure.ListBuilder;
import easy.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/20.
 */
public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5);
        ListNode head = ListBuilder.buildList(list);
        ListNode res = new RemoveDuplicatesFromSortedListII().deleteDuplicates(head);
        ListBuilder.printList(res);
    }
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        ListNode nxt = head;
        if(head==null||head.next==null) return head;
        while(nxt.next!=null){
            if(nxt.val!=nxt.next.val){
               if(pre.next == nxt){
                   pre = nxt;
               }
               else pre.next = nxt.next;
            }
            nxt = nxt.next;
        }
        if(pre.next!=nxt){
            pre.next = nxt.next;
        }
        return newHead.next;
    }
}
