package easy;

/**
 * Created by menghan on 2018/7/26.
 */
public class AddTwoNumbers {
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode readHead = new ListNode(-1);
        ListNode head = readHead;
        int add = 0;
        while(l1!=null||l2!=null){
            int l1val = l1==null?0:l1.val;
            int l2val = l2==null?0:l2.val;
            int val = l1val+l2val+add;
            head.next = new ListNode(val%10);
            head = head.next;
            add = val/10;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(add>0) head.next = new ListNode(add);
        return readHead.next;
    }
}
