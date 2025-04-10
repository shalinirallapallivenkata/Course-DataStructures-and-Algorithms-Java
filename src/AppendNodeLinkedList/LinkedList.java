package AppendNodeLinkedList;

class Node { // Not making it public but default. Making it accessible only in this package
    //Practising this part even thought Node class exists in the src
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

    public LinkedList(int value){
        Node newNode = new Node(value); // this is to access the variables stored in stack from the memory
        // i think when constructor called?
        this.head = newNode; // separate classes not an inner class so using this here lets see
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head; // Type mentioned here i.e: Node
        // when this class is instantiated i.e: an object is created, the memory in heap is allocated thats what i think
        while(temp != null ) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getHead(){
        return this.head.value; // this. here cos na accessing the variables of this class.
    }


    public int getTail(){
        return this.tail.value;
    }


    public int getLength(){
        return this.length;
    }

    public void appendList(int value){
        Node newNode = new Node(value);
        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }
}
