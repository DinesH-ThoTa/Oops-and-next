package linkedList;
//https://leetcode.com/problems/reverse-linked-list-ii/submissions/
public class reveseList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(right-left == 0)
            return head;
        ListNode prev = null;
        ListNode cur = head;

        //skip the left-1 elements
        for(int i=0; cur != null && i < left -1; i++){
            prev = cur;
            cur = cur.next;
        }

        //store the link
        ListNode last = prev;//last is the node after which we will reverse
        ListNode newEnd = cur;//newEnd is the end of reversed list

        //reverse the elements
        ListNode nex = cur.next;
        for(int i=0; cur != null && i <right-left+1; i++){
            cur.next = prev;
            prev = cur;
            cur = nex;
            if(nex != null)
                nex = nex.next;
        }

        //if last is null then prev will be head as it points to first reversed element
        if(last != null)
            last.next = prev;
        else
            head = prev;

        //as we know the curr will be the next of prev before reversal
        newEnd.next = cur;
        return head;

    }
}
