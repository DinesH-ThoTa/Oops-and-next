package linkedList;

import java.util.List;

//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
public class MiddleElement {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        ListNode ans = head;
        int mid = (size / 2);
        while (mid > 0) {
            ans = ans.next;
            mid--;
        }
        return ans;
    }

    public ListNode middleNodeMethod2(ListNode head) {
        if (head == null)
            return null;
        int size = 0;
        ListNode temp = head;
        ListNode ans = head;
        while (temp != null && temp.next != null) {
            temp = temp.next.next;
            ans = ans.next;
        }
        return ans;
    }
}
