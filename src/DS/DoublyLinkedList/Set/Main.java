package DS.DoublyLinkedList.Set;

public class Main {
    public static void main(String[] args) {
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
        newList.printList();
        System.out.println("After removing last node");
        newList.removeLast();
        newList.printList();
        System.out.println("After Prepending");
        newList.prepend(181);
        newList.printList();
        System.out.println("After removing first node");
        newList.removeFirst();
        newList.printList();
        newList.prepend(181);
        System.out.println("The new list is ");
        newList.printList();
        System.out.println("The value of the node at index 3 is: ");
        System.out.println(newList.get(3).value);
        newList.set(3, 889);
        System.out.println("After setting value of index 3 to 889");
        newList.printList();
    }
}
