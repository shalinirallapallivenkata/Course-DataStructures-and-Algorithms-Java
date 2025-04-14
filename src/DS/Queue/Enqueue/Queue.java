package DS.Queue.Enqueue;

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
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Queue FIFO - first in first out

    public void enqueue(int valus){
        Node newNode = new Node(valus);
        if(this.length == 0){
            this.first = newNode;
            this.last = newNode;
        }
        else {
            this.last.next = newNode;
            this.last = newNode;
        }
        length++;
    }
}
