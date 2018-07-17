package tests;


import com.pilotsham.Node;
import com.pilotsham.SLinkedList;

public class SLinkedListTest {

    Node node = new Node(5);
    SLinkedList sLinkedList = new SLinkedList();


    public static void main(String[] args) {
        SLinkedListTest sLinkedListTest = new SLinkedListTest();
        sLinkedListTest.addValuesToLinkedList();
        System.out.println(sLinkedListTest.sLinkedList.size());

//        sLinkedListTest.sLinkedList.pushBack(300);
//
//        sLinkedListTest.sLinkedList.pushFront(12);
//        sLinkedListTest.sLinkedList.popFront();
//        System.out.println(sLinkedListTest.sLinkedList.front().key);
//        System.out.println(sLinkedListTest.sLinkedList.back().key);
//        sLinkedListTest.sLinkedList.pushBack(18);
//        System.out.println(sLinkedListTest.sLinkedList.back().key);


        /**
         * Print values of the linkedList while the head is not null
         */
        sLinkedListTest.sLinkedList.remove(8);
        System.out.println(sLinkedListTest.sLinkedList.find(2));
        System.out.println(sLinkedListTest.sLinkedList.find(7));

        sLinkedListTest.printLinkedList();


    }

    public SLinkedListTest() {

    }

    public void addValuesToLinkedList() {
        sLinkedList.head = new Node(4);

        Node node2 = new Node(6);
        Node node3 = new Node(8);
        Node node4 = new Node(7);
        Node node5 = new Node(10);

        sLinkedList.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }


    public void printLinkedList() {

        while (sLinkedList.head != null) {
            System.out.print(sLinkedList.head.key + " ");
            sLinkedList.head = sLinkedList.head.next;
        }


    }


}
