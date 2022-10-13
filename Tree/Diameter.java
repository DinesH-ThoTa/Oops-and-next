package Tree;

public class Diameter {
    public static int diameterOfBinaryTree(Node root) {
        int[] diameter = new int[1];
        find(root,diameter);
        return diameter[0];
    }
    public static int find(Node root, int[] diameter){
        if(root == null)
            return 0;

        int lh = find(root.left, diameter);
        int rh = find(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh);
        return 1+Math.max(lh, rh);
    }
}
