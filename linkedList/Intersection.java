package linkedList;

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        ListNode a_pointer =  headA;
        ListNode b_pointer = headB;

        while(a_pointer != b_pointer){
            if(a_pointer == null)
                a_pointer = headB;//whenever the pointer reaches null assign it to another head
                                  //such that both the pointers will traverse equally
            else
                a_pointer = a_pointer.next;
            if(b_pointer == null)
                b_pointer = headA;
            else
                b_pointer = b_pointer.next;
        }
        return a_pointer;
    }
}
