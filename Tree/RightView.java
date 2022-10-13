package Tree;

import java.util.ArrayList;
import java.util.List;

public class RightView {
    public List<Integer> rightView(Node root){
        List<Integer> ans = new ArrayList<>();
        return helper(root,0,ans);
    }

    private List<Integer> helper(Node root, int level, List<Integer> ans) {
        if(root == null)
            return ans;
        //we add the very first element in every level, so as we traverse root-right-left right side view will be saved
        if(level == ans.size())
            ans.add(root.val);
        helper(root.right, level+1, ans);
        helper(root.left, level+1, ans);

        return ans;
    }
}
//    @zwangbo Neat algorithm... Just want to add 3 points:
//        (1) the traverse of the tree is NOT standard pre-order traverse. It checks the RIGHT node first and then the LEFT
//        (2) the line to check currDepth == result.size() makes sure the first element of that level will be added to the result list
//        (3) if reverse the visit order, that is first LEFT and then RIGHT, it will return the left view of the tree.