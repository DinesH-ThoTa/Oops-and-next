package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

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

    //preorder traversal using iterative
    public List<Integer> preorder_iter(Node root, List<Integer> ans){
        if(root == null)
            return ans;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            root = s.pop();
            ans.add(root.val);
            if(root.right != null)
                s.push(root.right);
            if(root.left != null)
                s.push(root.left);
        }
        return ans;
    }

    public static void inorder(Node node){
        if(node == null)
            return;
        inorder(node.left);
        System.out.print(node.val +" ");
        inorder(node.right);
    }

    public static List<Integer> inorder_iter(Node root, List<Integer> ans){
        if(root == null)
            return ans;
        Stack<Node> s = new Stack<>();
        Node node = root;
        while(true){
            if(node != null){
                s.push(node);
                node = node.left;
            }
            else{
                if(s.isEmpty())
                    break;
                node = s.peek();
                ans.add(node.val);
                s.pop();
                node = node.right;
            }
        }
        return ans;
    }

    public static void postorder(Node node){
        if(node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val +" ");
    }

    public static void iter_postorder(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        while(!s1.isEmpty()){
            root = s1.pop();
            s2.add(root);
            if(root.left != null)
                s1.push(root.left);
            if(root.right != null)
                s1.push(root.right);
        }
        while(!s2.isEmpty())
            System.out.print(s2.pop().val+" ");
    }


    public static void all_traversal(Node root){
        List < Integer > pre = new ArrayList < > ();
        List < Integer > in = new ArrayList < > ();
        List < Integer > post = new ArrayList < > ();
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root,1));

        if (root == null)
            return;

        while(!s.isEmpty()){
            Pair it = s.peek();
            // this is part of pre
            // increment 1 to 2
            // push the left side of the tree
            if(it.num == 1){
                pre.add(it.node.val);
                it.num++;
                s.push(it);
                if(it.node.left != null){
                    s.push(new Pair(it.node.left, 1));
                }
            }
            // this is a part of in
            // increment 2 to 3
            // push right
            if(it.num == 2){
                in.add(it.node.val);
                it.num++;
                s.push(it);
                if(it.node.right != null){
                    s.push(new Pair(it.node.right, 1));
                }
            }
            // don't push it back again
            else{
                post.add(it.node.val);
            }
        }
    }

    public static int maxDepth(Node root){
        if(root == null)
            return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Traversals obj = new Traversals();
        Node  root = obj.buildTree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> op =inorder_iter(root, ans);
        for (int i:op) {
            System.out.print(i+" ");
        }
        System.out.println();
        postorder(root);
        System.out.println("iter PostOrder");
        iter_postorder(root);
        System.out.println();
        System.out.println(maxDepth(root)
        );

    }

}
