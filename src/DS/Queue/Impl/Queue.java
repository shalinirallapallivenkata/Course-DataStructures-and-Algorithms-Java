package DS.Queue.Impl;


class Node  {
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

    public void printList() {
        Node temp = this.first;
        if (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
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
}
