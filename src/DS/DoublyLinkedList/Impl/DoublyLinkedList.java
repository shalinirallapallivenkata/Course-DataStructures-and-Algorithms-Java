package DS.DoublyLinkedList.Impl;
class Node {
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
    }
}
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public int getHead(){
        return this.head.value;
    }

    public int getTail(){
        return this.tail.value;
    }

    public int getLength(){
        return this.length;
    }
}
