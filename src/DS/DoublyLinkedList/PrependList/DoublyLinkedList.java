package DS.DoublyLinkedList.PrependList;

class Node {
    int value;
    Node next;
    Node prev;

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
        while(temp!= null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
            newNode.prev = this.tail;
        }
        length++;
    }

    public Node removeLast(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.tail;
        Node prev = temp.prev;
        this.tail = prev;
        this.tail.next = null;
        temp.prev = null;
        temp.next = null;
        length--;
        if(this.length==0){
            this.tail=null;
            this.head= null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

}
