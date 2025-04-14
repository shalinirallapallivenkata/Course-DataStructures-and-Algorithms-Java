package DS.DoublyLinkedList.Append;


class Node {
    int  value;
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
        this.length =1;
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

    public void printList(){
        Node temp = this.head;
        while(temp!= null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }

    public void appendList(int value){
        Node newNode = new Node (value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        length++;
    }
}
