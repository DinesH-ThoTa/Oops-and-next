package Tree;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
public class Lowest_Commom_Ancestor {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null || root == p || root == q)
            return root;
        Node left = lowestCommonAncestor(root.left,  p,  q);
        Node right = lowestCommonAncestor(root.right,  p,  q);

        //result
        if(left == null)
            return right;
        else if(right == null)
            return left;
        else//if both right and left are not null we found answer
            return root;
    }
}
//    If root is null or if root is x or if root is y then return root
//        Made a recursion call for both
//        i) Left subtree
//
//        ii)Right subtree
//
//        Because we would find LCA in the left or right subtree only.
//
//        If the left subtree recursive call gives a null value that means we haven’t found LCA in the left subtree, which means we found LCA on the right subtree. So we will return right.
//        If the right subtree recursive call gives null value, that means we haven’t found LCA on the right subtree, which means we found LCA on the left subtree. So we will return left .
//        If both left & right calls give values (not null)  that means the root is the LCA.