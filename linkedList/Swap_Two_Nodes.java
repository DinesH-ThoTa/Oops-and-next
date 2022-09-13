package linkedList;
//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/submissions/
import java.util.ArrayList;
import java.util.List;

public class Swap_Two_Nodes {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode temp = head;
        List<Integer> list = new ArrayList<Integer>();
        int size =0;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
            size++;
        }

        ListNode temp1 = head;
        int count = 1;
        while(temp1 != null){
            if(count == k){
                temp1.val = list.get(size-k);
            }
            else if(count == (size - k) + 1){
                temp1.val = list.get(k-1);
            }
            temp1 = temp1.next;
            count ++;
        }
        return head;
    }

    public ListNode swapNodes2(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode first = head, second = head;

        // Put fast (k-1) nodes after slow
        for(int i = 0; i < k - 1; ++i)
            fast = fast.next;

        // Save the node for swapping
        first = fast;

        // Move until the end of the list
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Save the second node for swapping
        // Note that the pointer second isn't necessary: we could use slow for swapping as well
        // However, having second improves readability
        second = slow;

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
