package DS.LinkedList.Reverse;

public class Main {
    public static void main(String[] args){
        LinkedList newList = new LinkedList(1);
        newList.appendList(2);
        newList.prependList(3);
        newList.printList();
        System.out.println("Removing First node from rear end" + " : " + newList.removeLast().value);
        System.out.println("Removing Second node from rear end" + " : " + newList.removeLast().value);
        System.out.println("Removing Third node no node is present" + " : " + newList.removeLast().value);
        System.out.println("Return null when no node is present" + " : " + newList.removeLast());
        newList.appendList(1);
        newList.appendList(2);
        newList.prependList(3);
        newList.printList();
        System.out.println("Removing First node from the start end" + " : " + newList.removeFirst().value);
        System.out.println("Removing Second node from the start end" + " : " + newList.removeFirst().value);
        System.out.println("Removing Third node from the start end" + " : " + newList.removeFirst().value);
        System.out.println("Return null when no node is present" + " : " + newList.removeLast());
        newList.appendList(563);
        newList.appendList(288);
        newList.prependList(377);
        newList.printList();
        System.out.println("The value of the Node at index 2 is : " + " : " + newList.get(2).value);
        newList.set(2, 265);
        newList.printList();
        System.out.println("This is the new list after inserting a node at the index 3");
        newList.insert(3,288);
        newList.printList();
        System.out.println("The removed value of nodes at 2 and 0 indexes");
        newList.remove(2,265);
        newList.remove(0,377);
        newList.printList();
        System.out.println("The reversed list is: ");
        newList.remove(0, 377);
        newList.remove(1, 288);
        newList.appendList(563);
        newList.appendList(234);
        newList.appendList(377);
        newList.insert(3,288);
        newList.reverse();
        newList.printList();

    }
}
