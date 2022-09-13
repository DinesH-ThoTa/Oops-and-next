package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertLast(40);
//        list.insertLast(50);
//        list.insertFirst(60);
//        list.display();
//        System.out.println(  list.deleteFirst());
//        list.display();
//        list.insertFirst(0);
//        list.insert(5,1);
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));

        list.insertRec(10,0);
        list.insertRec(20,1);
        list.insertRec(30,2);

        list.insertRec(40,3);
        list.insertRec(50,2);

        list.display();

    }
}
