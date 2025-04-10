package LinkedListDataStructure;

class Node {            // default access modifier accessible only int his package
    int value;
    Node next;

    Node(int value) {  // constructor
        this.value = value;
    }
} // why did he make Node an inner class?
public class LinkedList {
    private Node head; // making them private to use getter and setter methods
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }
}
