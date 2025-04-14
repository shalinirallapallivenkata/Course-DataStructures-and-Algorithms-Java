package DS.DoublyLinkedList.Get;

import DS.LinkedList.Impl.LinkedList;

class Node {
    int value;
    Node next;
    Node prev;

    public Node (int value){
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

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
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
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.tail;
        this.tail.prev = this.tail;
        this.tail.next = null;
        temp.prev = null;
        length--;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public  void prepend(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.head.prev = null;
        length--;
        if(this.length == 0){
            this.tail = null; // since before decrementing the temp i;e: the first head value will point to null
            // Thus with only one node just pointing tail to null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= this.length){
            return null;
        }
        Node temp = this.head;// start of DoublyLinkedList .next // can't add this in conditional statement *scope*
        // using the prev and next pointers in Doubly Linked list and making the DoublyLinkedList for better efficiency
        // in get by using conditional statements with first half of the DoublyLinkedList and second half.

        if(index <= this.length/2){ // using <= having the middle number if odd number of node values
            for(int i =0 ; i < index ; i++){
                temp=temp.next;

                // first half iterating this. head fwd using .next
                // ****very important . next is the pointer to the node and not the node itself
                // thus for the below .prev is this.head.prev pointers!
            }
        }
        else{
            temp = this.tail;// end of DoublyLinkedList .prev
            for(int i = this.length -1 ; i> index ; i--){ // adding >= for the next value after middle value
                temp = temp.prev; // first half iterating this.head fwd using .prev
            }
        }
        return temp;
    }
}
