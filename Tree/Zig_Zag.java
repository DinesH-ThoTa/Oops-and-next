package Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zig_Zag {
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        //edge case
        if(root == null)
            return ans;

        //first insert the root node into queue
        q.offer(root);
        //until the queue is empty
        boolean flag =false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> sublist = new LinkedList<Integer>();
            //run for loop for every element in queue
            for(int i=0; i<size; i++){
                //check whether the curnode has left and right nodes, if present insert into queue

                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                sublist.add(q.poll().val);

                //store the value and remove the node from queue
            }
            if(flag)
                Collections.reverse(sublist);
            flag = !flag;
            ans.add(sublist);
        }
        return ans;
    }
}
