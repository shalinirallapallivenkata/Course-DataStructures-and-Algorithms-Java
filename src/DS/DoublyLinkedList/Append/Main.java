package DS.DoublyLinkedList.Append;

public class Main {

    public static void main(String[] args){
        DoublyLinkedList newList = new DoublyLinkedList(4);
        System.out.println(" The value of head is" + " : " + newList.getHead());
        System.out.println(" The value of tail is" + " : " + newList.getHead());
        System.out.println(" The length of the doubly linked list is" + " : " + newList.getLength());
        System.out.println("Before append");
        newList.printList();
        System.out.println("After append");
        newList.appendList(324);
        newList.printList();;

    }
}
