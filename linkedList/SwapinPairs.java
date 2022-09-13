package linkedList;

public class SwapinPairs {
    //do it with pen and paper

//    The idea is straightforward: use two pointers and swap
//    a.next = b.next, b.next = a.
//    Then continue the next pair, b = a.next.next, a=a.next
//    Remember to check null
//    Remember to track new head
//    Remember to link the new pair after the prior nodes.
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = head.next, a = head, b = head.next, prev = null;
        while(a != null && b != null){
            a.next = b.next;
            b.next = a;
            if(prev != null)
                prev.next = b;
            if(a.next == null) break;
            b = a.next.next;
            prev = a;
            a = a.next;
        }
        return newHead;
    }

}
