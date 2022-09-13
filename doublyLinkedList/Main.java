package doublyLinkedList;

public class Main {
    public static void main(String[] args) {
//        DLL list = new DLL();

//        list.insertFirst(50);
//        list.insertFirst(40);
//        list.insertFirst(30);
//        list.insertFirst(20);
//        list.insertLast(60);
//        list.insertAfter(60, 70);
//        list.display();
        CLL list = new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(30);
        list.display();


    }
}
