package linkedList;

import java.util.List;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail == null){//if there are no elements head and tail will point to only element added
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;

        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {//this will end at index-1
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void insertRec(int val, int index){

        head=insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){//when we found index we will create the new node
            Node temp = new Node(val, node);//here we are passing node as next, as we know that current
            //index node will be next of the inserted node
            size++;
            return temp;
            //after creating the new node we will return it to previous function call
        }
        //we are traversing through the linked list
        //when we come back from base we need to link the temp to previous node's next
        node.next=insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head=head.next;

        if(head == null){//if there is no element
            tail = null;
        }
        size--;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int value){//finding the node which contains the given value
        Node node = head;
        while(node != null){
            if(node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public int deleteLast(){
        if(size <= 1)
            return deleteFirst();


        Node secondLast=get(size-2);
        int val = tail.value;
        secondLast.next = null;
        tail = secondLast;
        size --;
        return val;
    }

    public int delete(int index){

        if(index == 0)
            return deleteFirst();

        if(index == size-1)
            return deleteLast();

        Node prev = get(index-1);
        int val =prev.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }

    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }


}
