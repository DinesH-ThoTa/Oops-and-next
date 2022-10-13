package Tree;

import java.util.ArrayList;
import java.util.List;

public class Path_to_Leaf {
    public List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        if(root == null)
            return ans;

        path(root,ans,"");
        return ans;
    }
    public static void path(Node root, List<String> ans, String s){
        if(root.left == null && root.right == null)
            ans.add(s+root.val);
        if(root.left != null) path(root.left,ans,s+root.val+"->");
        if(root.right != null) path(root.right,ans,s+root.val+"->");
    }
}
