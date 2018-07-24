package easy;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                tmp.next = l1;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        while(l1!=null){
            tmp.next = l1;
            l1 = l1.next;
            tmp = tmp.next;
        }
        while(l2!=null){
            tmp.next = l2;
            l2 = l2.next;
            tmp = tmp.next;
        }
        return head.next;
    }
}
