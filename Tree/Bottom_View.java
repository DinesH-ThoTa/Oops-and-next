package Tree;

import java.util.*;

class q_pair{
    Node node;
    int vert;
    q_pair(Node _node, int _vert){
        node = _node;
        vert = _vert;
    }
}
public class Bottom_View {
    public static ArrayList<Integer> bottom(Node root){
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<q_pair> q = new LinkedList<>();
        q.offer(new q_pair(root,0));
        while(!q.isEmpty()){
            q_pair cur = q.poll();
            int col = cur.vert;
            Node temp = cur.node;
            map.put(col,temp.val);
            if(temp.left != null)
                q.offer(new q_pair(temp.left,col-1));
            if(temp.right != null)
                q.offer(new q_pair(temp.right,col+1));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int val : map.values())
            list.add(val);
        return list;
    }
}
