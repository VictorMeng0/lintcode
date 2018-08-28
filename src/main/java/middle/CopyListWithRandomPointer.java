package middle;

import datastructure.RandomListNode;
import easy.ListNode;

/**
 * Created by menghan on 2018/8/24.
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        RandomListNode pointer = head;
        while(pointer!=null){
            RandomListNode copy = new RandomListNode(pointer.label);
            RandomListNode tmp = pointer.next;
            pointer.next = copy;
            copy.next = tmp;
            pointer = pointer.next.next;
        }
        RandomListNode fakeHead = head.next;
        RandomListNode fakePointer = fakeHead;
        pointer = head;
        while(pointer!=null){
            if(pointer.random!=null) {
                pointer.next.random = pointer.random.next;
            }
            pointer = pointer.next.next;
        }
        while(fakePointer.next!=null){
            fakePointer.next = fakePointer.next.next;
            fakePointer = fakePointer.next;
        }
        return fakeHead;
    }
}


