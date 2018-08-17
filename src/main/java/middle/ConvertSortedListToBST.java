package middle;

import easy.ListNode;
import easy.TreeNode;

/**
 * Created by menghan on 2018/8/16.
 */
public class ConvertSortedListToBST {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        new ConvertSortedListToBST().sortedListToBST(head);

    }
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        return buildTree(head, null);
    }
    public TreeNode buildTree(ListNode head,ListNode end){
        if(head==null||head==end) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=end&&fast.next!=end){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = buildTree(head, slow);
        root.right = buildTree(slow.next, end);
        return root;
    }

}
