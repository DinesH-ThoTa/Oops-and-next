package linkedList;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class Delete_from_Last {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        if(head.next == null)
            return null;
        ListNode revList = reverseList(head);
        ListNode revHead = revList;
        ListNode temp = revList;
        //if n is 1 then we need to delete last element so just move the head in reverse list
        if(n == 1){
            temp = temp.next;
            return reverseList(temp);
        }
        int node = 0;
        ListNode prev = null;
        while(temp != null){

            if(node == n-1){
                prev.next = prev.next.next;
                break;
            }
            else{
                prev = temp;
                temp = temp.next;
            }

            node++;
        }

        ListNode rereverse = reverseList(revHead);
        return rereverse;
    }

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
}
