package Tree;
//https://leetcode.com/problems/path-sum/submissions/

public class PathSum {

    public boolean hasPathSum(Node root, int targetSum) {
        if (root == null)
            return false;
        //path should end at leaf node only we have path
        if (root.left == null && root.right == null && targetSum - root.val == 0)
            return true;
        boolean lh = hasPathSum(root.left, targetSum - root.val);
        boolean rh = hasPathSum(root.right, targetSum - root.val);
        return lh || rh;
    }
}
