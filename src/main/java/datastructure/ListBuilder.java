package datastructure;

import easy.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by menghan on 2018/8/21.
 */
public class ListBuilder {
    public static ListNode buildList(List<Integer> list){
        if(list.size()<1) return null;
        ListNode head = new ListNode(list.get(0));
        ListNode tmp = head;
        for(int i=1;i<list.size();i++){
            tmp.next = new ListNode(list.get(i));
            tmp = tmp.next;
        }
        return head;
    }
    public static void printList(ListNode head){
        while(head!=null&&head.next!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        if(head!=null) System.out.print(head.val);
    }
    public static List<String> copyList(List<String> list){
        List<String> res = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            res.add(list.get(i));
        }
        return res;
    }
}
