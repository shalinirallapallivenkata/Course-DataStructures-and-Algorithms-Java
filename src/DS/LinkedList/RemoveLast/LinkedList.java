package DS.LinkedList.RemoveLast;

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

    public void appendList(int value){
        Node newNode = new Node(value);
        if (length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public Node removeLast() {      // returning the last Node removed
        // this first this.length== 0 is when the length of node is 0
        if (this.length == 0){
            return null;
        }
        // using pre and temp
        Node temp = this.head;
        Node pre = temp;
        // iterating pre till last but one Node and temp till last node
        while (temp.next != null) { // iterating till the last node
            // first  assign the previous value to temp
            pre = temp;
            // then iterate temp till last node before temp.next is not null
            temp = temp.next;
        }
        // assigning tail vale as pre since pre is one node before last node after iteration
        this.tail = pre;
        pre.next = null;
        // decrementing the length of Linked List
        this.length--;
        // if there is only one single Node while loop wouldnt be executed
        // Also  the head, tail, pre and temp will be pointing to that particular single.
        // there wont be any decrementing
        // hence if only one node exists:
        if (this.length == 0){ // this edge case only for one node above anyway if one node is there the decrementing happens
            this.head = null;
            this.tail = null;
        }
        return temp;
    }
}
