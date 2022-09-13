package linkedList;
//https://leetcode.com/problems/reverse-linked-list/submissions/
public class reverseList {
//iterative solution with three pointers
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode prev = null, pres = head, nex = head.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = nex;
            if(nex != null)
                nex = nex.next;

        }
        return prev;
    }
 //recursive solution with same concept

    public ListNode reverseListRec(ListNode head) {
        if(head == null)
            return null;
        return helper(head, null);
    }
    public ListNode helper(ListNode head, ListNode prev){
        if(head == null)
            return prev;
        ListNode next = head.next;
        head.next = prev;

        return helper(next, head);
    }

}
