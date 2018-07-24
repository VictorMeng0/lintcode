package naive;

import easy.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead;
        ListNode tmp = head;
        while(tmp!=null){
            if(tmp.val!=val){
                pre = pre.next;
            }else{
                pre.next = tmp.next;
            }
            tmp = tmp.next;
        }
        return newHead.next;
    }
}
