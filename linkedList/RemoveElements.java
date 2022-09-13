package linkedList;
//https://leetcode.com/problems/remove-linked-list-elements/submissions/
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return null;

        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode prev = head, temp = head;

        while(temp != null){
            if(temp.val == val){
                // ListNode store = temp
                prev.next = prev.next.next;
            }
            else
                prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
