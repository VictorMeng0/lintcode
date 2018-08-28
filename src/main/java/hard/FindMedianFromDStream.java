package hard;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by menghan on 2018/8/28.
 */
public class FindMedianFromDStream {
    public static void main(String[] args) {
        int[] a = {2,20,13,18,15,8,3,5,4,25};
        int[] res = new FindMedianFromDStream().medianII(a);
        for(int num : res) System.out.println(num);
    }
    Queue<Integer> minHeap = new PriorityQueue<>();
    Queue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    public int[] medianII(int[] nums) {
        // write your code here
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            reorderHeap(nums[i]);
            res[i] = findMedian();
        }
        return res;
    }
    public void reorderHeap(int val){
        minHeap.offer(val);
        if(minHeap.size()>maxHeap.size()) maxHeap.offer(minHeap.poll());
        if(maxHeap.size()>minHeap.size()) minHeap.offer(maxHeap.poll());
    }
    public int findMedian(){
        return (minHeap.size()+maxHeap.size())%2==0?maxHeap.peek():minHeap.peek();
    }

}
