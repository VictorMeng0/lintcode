package easy;

/**
 * Created by menghan on 2018/7/26.
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println();
    }
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head==null||head.next==null) return head;
        ListNode pre = head;
        ListNode nxt = head.next;
        while(nxt!=null){
            if(pre.val == nxt.val){
                pre.next = nxt.next;
            }else {
                pre = pre.next;
            }
            nxt = nxt.next;
        }
        return head;
    }
}
