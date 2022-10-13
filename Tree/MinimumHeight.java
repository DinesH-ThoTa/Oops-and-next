package Tree;

public class MinimumHeight {

    public int minDepth(Node root){
        if(root == null)
            return 0;

        if(root.right != null && root.left != null)
            return Math.min(minDepth(root.left), minDepth(root.right))+1;
        //if the left or right is null we need to move to max part
        else return Math.max(minDepth(root.left), minDepth(root.right))+1;

    }
}
