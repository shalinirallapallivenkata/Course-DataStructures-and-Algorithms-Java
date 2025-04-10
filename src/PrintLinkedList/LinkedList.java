package PrintLinkedList;

class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    // implementing LL and Node

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp =  temp.next;  // temp is added as type Node has value and next
        }
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
