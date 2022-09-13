package doublyLinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }


    public void insert(int val){//inserting elements at last
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        if(head.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        Node node = head;
        do{
            Node n= node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);

    }


    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.val+" -> ");
                node = node.next;
            }
            while (node != head);
        }
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
