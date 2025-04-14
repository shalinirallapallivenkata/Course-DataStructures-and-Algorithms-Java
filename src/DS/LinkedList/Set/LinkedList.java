package DS.LinkedList.Set;

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

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
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

    public void appendList(int value) {
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void prependList(int value){
        Node newNode = new Node(value);
        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeLast() {
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        Node pre = temp;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        pre = this.tail;
        pre.next = null;
        this.length--;
        if (this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public Node removeFirst(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        this.head.next = this.head;
        temp.next = null;
        this.length--;
        if (this.length == 0){
            this.tail = null;
        }
        return temp;
    }

    public Node get(int index){
        Node temp = this.head;
        if (index < 0 || index >= this.length ){
            return null;
        }
        else {
            for (int i = 0 ; i < index; i++){
                temp = temp.next;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
}
