package linkedList;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);//split the list into two halves
        ListNode secondHead = reverseList(mid);//reverse the second half
        ListNode rereverseHead = secondHead;//store the second head in another variable(optional)

        //compare both halves
        while(head != null && secondHead != null){
            if(head.val != secondHead.val)
                break;
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(rereverseHead);//(list will be original again)
        return head == null || secondHead == null;
    }
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        int size = 0;
        ListNode temp = head;
        ListNode ans = head;
        while (temp != null) {
            temp = temp.next.next;
            ans = ans.next;
        }
        return ans;
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
