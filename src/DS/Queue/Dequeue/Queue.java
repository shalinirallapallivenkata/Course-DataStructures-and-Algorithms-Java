package DS.Queue.Dequeue;

class Node {
    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }
}
public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public int getFirst(){
        return this.first.value;
    }

    public int getLast(){
        return this.last.value;
    }

    public int getLength(){
        return this.length;
    }

    public void printList(){
        Node temp = first;
        while (temp != null ){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value) {  // same as append so adding value at the last Node??
        Node newNode = new Node(value);
        if(this.length == 0){
            this.first = newNode;
            this.last = newNode;
        }
        else{
            this.last.next = newNode;
            this.last = newNode;
        }
        length++;
    }

    // Stack is Last in First out;
    // Enqueue with O(1) can do for O(n) too
    // we go for always O(1) hence Dequeue on the first node
    // Enqueue similar ro append on last Node
    // Dequeue is First in First out
    public Node dequeue(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.first;
        this.first = first.next;
        temp.next = null;
        length--;
        if(this.length == 0){
            this.last = null;
            this.first = null;
        }
        return temp;
    }
}
