package DS.Stack.Push;


class Node {
    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }
}
public class Stack {
    private Node top;
    private int height;
    public  Stack(int value){
        Node newNode = new Node(value);
        this.top = newNode;
        this.height = 1;
    }

    public void printList(){
        Node temp = this.top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getTop(){
        return this.top.value;
    }

    public int getHeight(){
        return this.height;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(this.height == 0){
            this.top = newNode;
        }
        else{
            newNode.next = this.top;
            this.top = newNode;
        }
        height++;
    }
}
