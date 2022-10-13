package Tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/path-sum-ii/
public class PathSum_II {
    public List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> op = new ArrayList<Integer>();
        return helper(root,targetSum,op,ans);
    }
    public static List<List<Integer>> helper(Node root, int targetSum, List<Integer> op,List<List<Integer>> ans){
        if(root == null)
            return ans;
        op.add(root.val);
        if(root.right == null && root.left == null && targetSum - root.val == 0){
            ans.add(op);
            return ans;
        }

        helper(root.left, targetSum-root.val,new ArrayList<Integer>(op),ans);
        helper(root.right, targetSum-root.val,new ArrayList<Integer>(op),ans);
        op.remove(op.size()-1);
        return ans;
    }
}
