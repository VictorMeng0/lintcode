package easy;

/**
 * Created by menghan on 2018/7/26.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        ListNode nxt = head;
        if(head == null) return head;
        while(nxt!=null&&nxt.val<x){
            pre = pre.next;
            nxt = nxt.next;
        }
        ListNode insertNode = pre;
        while (nxt!=null){
            if(nxt.val<x){
                pre.next = nxt.next;
                nxt.next = insertNode.next;
                insertNode.next = nxt;
                insertNode = insertNode.next;
            }else{
                pre = pre.next;
            }
            nxt = pre.next;
        }
        return newHead.next;

    }
}
