package Tree;



//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaxPathSum {
    public static int maxPathSum(Node root){
        if(root == null)
            return 0;
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        helper(root,maxVal);
        return maxVal[0];
    }
    public static int helper(Node root, int[] maxVal){
        if(root == null)
            return 0;
        //first go left, if the left node is negative ignore
        int l = Math.max(0,helper(root.left, maxVal));
        int r = Math.max(0,helper(root.right, maxVal));
        //store the maximum
        maxVal[0] = Math.max(maxVal[0], l+r+root.val);
        //return the path with the highest node value
        return root.val+ Math.max(l,r);
    }
}
