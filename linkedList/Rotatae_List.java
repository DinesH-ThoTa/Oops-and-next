package linkedList;

public class Rotatae_List {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null)
            return head;


        ListNode last = head;
        int size = 1;
        while(last.next != null){
            size++;
            last = last.next;

        }

        k %= size;

        last.next = head;//attaching the lastnode to head
        ListNode newLast = head;
        int newLast_length = size - k;//we will have our new end from length-k far
        for (int i = 0; i < newLast_length - 1; i++) {//we will land at newLast node
            newLast = newLast.next;
        }
        ListNode newhead = newLast.next; //our newhead will be next to newaLast
        newLast.next = null;//the next of new last will be null
        return newhead;
    }
}
