package Tree;

import java.util.ArrayList;
import java.util.List;

public class Path_to_Node {
    public static List<Integer> path(Node root, int val){
        List<Integer> ans = new ArrayList<>();
        check(root,ans,val);
        return ans;
    }
    public static boolean check(Node root, List<Integer> ans, int x){
        if(root == null)
            return false;
        ans.add(root.val);
        if(root.val == x)
            return true;
        if(check(root.left,ans,x) || check(root.right,ans,x))
            return true;
        ans.remove(ans.size()-1);
        return false;
    }
}
