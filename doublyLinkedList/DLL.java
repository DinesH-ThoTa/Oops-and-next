package doublyLinkedList;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){//if not it will throw error for first element
            head.prev = node;
        }
        head = node;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }


    public void insertAfter(int val , int insertValue)
    {
        Node node = new Node(insertValue);
        Node previous = head;
        while(previous.val != val){
            previous = previous.next;
        }
        //first connect node to the next element using previous
        node.next = previous.next;
        node.prev = previous;
        previous.next = node;
        if( previous.next != null)
            previous.next.prev = node;
    }


    public void display(){
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.val +" ->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
