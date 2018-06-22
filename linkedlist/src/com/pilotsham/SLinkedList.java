package com.pilotsham;

public class SLinkedList {
    public Node head;


    public void pushFront(int value) {
        /**
         * adds an item to the front of the list
         */
        /**
         * This runs in O(1) -- constant time
         */
        /**
         * Create new node in memory, point the new node's next value to the t
         */

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }

    public Node popFront() {
        /**
         * Remove front item and return its value
         */
        Node temp = head;
        head = head.next;
        return temp;

    }

    public void pushBack(int value) {
        /**
         * adds an item at the end of the list
         */
        Node tempLast = head;
        while (tempLast.next != null) {
            tempLast = tempLast.next;

        }

        Node newNode = new Node(value);
        tempLast.next = newNode;

    }

    public Node front() {
        /**
         * get the value of the front item in the linked list
         */
        return head;
    }

    public Node back() {
        /**
         * get the value of the last item in the linked list
         */
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    public void insert(int index, int value) {
        /**
         * insert value at index, so current item at that index is pointed to by new item at index
         */
        Node newNode = new Node(value);
        Node tempHead = head;
        int i = 0;
        while (i < index) {


        }
        while (tempHead != null) {

            tempHead = tempHead.next;

        }


    }

    public void remove(int index) {
        /**
         * removes node at the given index
         */
    }

    public int size() {
        /**
         * returns the number of data elements in the list
         */
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void reverse() {
        /**
         * reverses the list
         */

    }

    public boolean find(int key) {

        /**
         * Find if the key is in the list
         */




        return true;

    }

    public boolean empty() {
        /**
         * Returns true if the list is empty
         */
        return true;
    }

    public void addBefore(Node node, int key) {
        /**
         * adds key before a particular node
         */

    }

    public void addAfter(Node node, int key) {
        /**
         * adds a key after a given node
         */
    }


}
