package middle;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by menghan on 2018/8/28.
 */
public class SerializeAndDeserializeBinaryTree {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        String res = new SerializeAndDeserializeBinaryTree().serialize(root);
//        System.out.println(res);

        String a = "3 9 20 # # 15 7 # # # # ";
        TreeNode root = new SerializeAndDeserializeBinaryTree().deserialize(a);
        System.out.println(new SerializeAndDeserializeBinaryTree().serialize(root));
    }

    public String serialize(TreeNode root) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        if(root == null) return "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp == null){
                sb.append("# ");
                continue;
            }
            sb.append(tmp.val+" ");
            queue.offer(tmp.left);
            queue.offer(tmp.right);
        }
        return sb.toString();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if(data == null||data.equals("")) return null;
        String[] values = data.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.offer(root);
        for(int i=1;i<values.length;i+=2){
            TreeNode left = values[i].equals("#")?null:new TreeNode(Integer.parseInt(values[i]));
            TreeNode right = values[i+1].equals("#")?null:new TreeNode(Integer.parseInt(values[i+1]));
            TreeNode tmp = queue.poll();
            tmp.left = left;
            tmp.right = right;
            if(left!=null) queue.offer(left);
            if(right!=null) queue.offer(right);
        }
        return root;
    }

}
