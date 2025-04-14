package DS.DoublyLinkedList.PrependList;

public class Main {
    public  static void main(String[] args){
        DoublyLinkedList newList = new DoublyLinkedList(4);
        System.out.println(" The value of head is" + " : " + newList.getHead());
        System.out.println(" The value of tail is" + " : " + newList.getHead());
        System.out.println(" The length of the doubly linked list is" + " : " + newList.getLength());
        System.out.println("Before append");
        newList.printList();
        System.out.println("After append");
        newList.append(324);
        newList.append(234);
        newList.append(546);
        newList.append(122);
        newList.printList();;
        System.out.println("After removing last node");
        newList.removeLast();
        newList.printList();
        System.out.println("After Prepending");
        newList.prepend(181);
        newList.printList();
    }
}
