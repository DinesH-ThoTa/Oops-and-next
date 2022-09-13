package linkedList;

public class CycleInLL {

    //https://leetcode.com/problems/linked-list-cycle/submissions/
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }

    public int CycleLength(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ListNode temp = slow;//take temp as slow and move it until it meets slow
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;

    }

    //https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {

        boolean isCycle = false;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;//if cycle is found break from loop
                break;
            }
        }
        if(!isCycle)
            return null;
        ListNode start = head;//start a pointer from start
        while(start != slow){//both the pointers will be at same distance from the start of loop
            start = start.next;
            slow = slow.next;
        }
        return slow;//we can return start or slow both points to same

    }



}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
  }
