package DS.LinkedList.Insert;

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

    // this refers to the instantiated object on creation in memory
    public LinkedList(int value){
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
         Node temp = this.head; // local variable to this method
         while(temp != null){
             System.out.println(temp.value);
             temp = temp.next;
         }
    }

    public void appendList(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void prependList(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

    public Node removeLast(){
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
        length --;
        if(this.length==0){
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
        if(this.length==0){
            this.tail=null;
        }
        return temp;
    }

    public Node get(int index){
        Node temp = this.head;
        if(index < 0 || index >= this.length){
            return null;
        }
        else {
            for (int i=0; i<index; i++){
                temp=temp.next;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        if(index < 0 && index > this.length){
            return  false;
        }
        Node temp = get(index);
        if (temp!=null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index <0 || index > this.length){
            return false;
        }
        if (index == 0){
            prependList(value);
            return true; // need this boolean or the below code will also be executed inserting nodes two times
        }
        if (index == this.length - 1){
            appendList(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next= temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
}
