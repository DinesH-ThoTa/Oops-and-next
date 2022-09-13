package Tree;

import com.sun.source.tree.Tree;

public class Traversals {
    static int index = -1;
    public static Node buildTree(int[] nodes){
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void preorder(Node node){
        if(node == null)
            return;
        System.out.print(node.val +" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node){
        if(node == null)
            return;
        inorder(node.left);
        System.out.print(node.val +" ");
        inorder(node.right);
    }

    public static void postorder(Node node){
        if(node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val +" ");
    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Traversals obj = new Traversals();
        Node  root = obj.buildTree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);

    }

}
