package DS.DoublyLinkedList.Set;

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

    public DoublyLinkedList(int value) {
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
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(this.length == 0){
            return  null;
        }
        Node temp = this.tail;
        this.tail = this.tail.prev;
        this.tail.next = null;
        temp.prev = null;
        length--;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
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
        this.head.prev = null;
        temp.next = null;
        length--;
        if(this.length==0){
            this.tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index <0 || index >= this.length){
            return null;
        }
        Node temp = this.head;
        if(index <= (this.length /2)){
            for(int i=0; i< index ; i++){
                temp = temp.next;
            }
        }
        else{
            temp = this.tail;
            for(int i = this.length - 1; i>index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return  true;
        }
        return false;
    }
}


