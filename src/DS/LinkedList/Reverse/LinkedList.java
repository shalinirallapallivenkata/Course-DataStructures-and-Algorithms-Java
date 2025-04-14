package DS.LinkedList.Reverse;


class Node{
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
        this.tail= newNode;
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

    public  void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp= temp.next;
        }
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
        length++;
    }

    public void prependList(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

    public  Node removeLast(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        Node pre = temp;
        while( temp.next !=null){
            pre= temp;
            temp = temp.next;
        }
        pre = this.tail;
        temp.next= null;
        length--;
        if(this.length==0){
            this.tail = null;
        }
        return temp;
    }

    public Node removeFirst(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        length--;
        if(this.length == 0){
            this.tail = null;
        }
        return temp;
    }

    public Node get(int index){
        Node temp = this.head;
        if(index < 0 || index >=this.length){
            return null;
        }
        else{
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!= null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > this.length){
            return false;
        }
        if(this.length == 0){
            prependList(value);
            return  true;
        }
        if(index == this.length){
            appendList(value);
            return  true;
        }
        Node temp = get(index - 1);
        Node newNode = new Node(value);
        newNode.next=temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index, int value){
        if(index < 0 || index > this.length){
            return null;
        }
        if(this.length == 0){
            return removeFirst();
        }
        if(index == this.length){
            return removeLast();
        }
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

//    public void reverse() {
//        Node temp = this.head;
//        this.head = this.tail;
//        this.tail = temp;
//        Node before= null;
//        Node after = temp.next;
//
//        for(int i = 0; i<length; i++){
//            after = temp.next;
//            temp.next = before;
//            before = temp;
//            temp = after;
//        }
//    }

    public void reverse(){
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node before = null;
        Node after = temp.next;
        for(int i=0; i< this.length ; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
