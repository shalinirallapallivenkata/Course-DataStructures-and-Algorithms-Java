package DS.DoublyLinkedList.RemoveLast;

class Node{
    int value;
    Node next;
    Node pre;

    public Node(int value){
        this.value= value;
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
        while(temp != null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }

    public  void append(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            newNode.pre= this.tail;
            this.tail = newNode;

        }
        length++;
    }

    public Node removeLast(){
        if(this.length == 0){
            return  null;
        }
        Node temp = this.tail;
        this.tail = temp.pre;
        this.tail.next = null;
        temp.pre = null;
        length--;
        // For only one node left after decrementing
        if(this.length == 0){
            this.head =null;
            this.tail = null;
        }
        return temp;
    }
}
