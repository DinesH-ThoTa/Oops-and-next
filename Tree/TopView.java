package Tree;

import java.util.*;

class pair{
    Node node;
    int vert;
    pair(Node _node, int _vert){
        node = _node;
        vert = _vert;
    }
}

public class TopView {
    static ArrayList<Integer> topView(Node root){
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            pair cur = q.poll();
            int col = cur.vert;
            Node temp = cur.node;
            //we only take the first node appeared in every column
            if(map.get(col) == null)
                map.put(col, temp.val);
            if(temp.left != null)
                q.offer(new pair(temp.left,col-1));
            if(temp.right != null)
                q.offer(new pair(temp.right,col+1));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int val : map.values())
            list.add(val);
        return list;
    }
}
//Approach:
//
//        First we have to make a queue of pair which have nodes and their respective +ve and -ve indexes.
//        Then we need a map data structure to store the lines and the nodes. This map will store the data in the form of sorted orders of keys(Lines).
//        Here we will follow the level order traversal.
//        Traverse through the nodes starting with root,0 and store them to the queue.
//        Until the queue is not empty, store the node  and line no. in 2 separate variable .
//        Then check if that line is present in the map or not
//        If not present then store the line and the node->val to the map
//        Otherwise store the node->left and node->right along with there line nos. to the queue.
//        Then print the node->val from the map