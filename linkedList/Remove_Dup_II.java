package linkedList;

public class Remove_Dup_II {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);//make a dummy list
        dummy.next = head;//dummy lists second/next node will be head
        ListNode curr = dummy;//take a curr to traverse

        while(curr != null){
            //compate the curr.next and curr.next.next
            if(curr.next != null && curr.next.next != null && curr.next.val == curr.next.next.val){
                //create a temp to catch all duplicates
                ListNode temp = curr.next.next;
                while(temp.next != null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                // when we come out of loop temp will be pointing to last duplicate
                //now set curr next as temp next
                curr.next = temp.next;//this will check for curr.next again
            }
            else
                curr = curr.next;
        }

        return dummy.next;
    }

}
