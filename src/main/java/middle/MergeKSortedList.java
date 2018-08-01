package middle;

import easy.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by menghan on 2018/7/27.
 */
public class MergeKSortedList {
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        Queue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(ListNode node:lists){
            if(node!=null) queue.offer(node);
        }
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            tmp.next = node;
            tmp = tmp.next;
            if(node.next!=null) queue.offer(node.next);
        }
        return head.next;
    }
}
