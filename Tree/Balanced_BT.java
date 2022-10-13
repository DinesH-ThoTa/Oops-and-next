package Tree;
//https://leetcode.com/problems/balanced-binary-tree/
public class Balanced_BT {
    public static boolean isBalanced(Node root) {
        if(maxDepth(root)==-1)
            return false;
        else
            return true;
    }

    public static int maxDepth(Node root) {
        if(root == null)
            return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        if(lh == -1 || rh == -1) return -1;//from the previous calls if i get -1,its not a balanced tree;
        if(Math.abs(lh-rh)>1)//if the difference is greater than return -1;
            return -1;
        return 1+Math.max(lh,rh);
    }
}
