package RemoveLastOrPopLastLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList newList = new LinkedList(1);
        System.out.println("This is new append list");
        newList.appendList(2);
        newList.printList();

        System.out.println("This is node with value 2 removed - if .value isn't mentioned" + " : " + newList.removeLast().value);
        // Since removeLast returns a node
        System.out.println("This is node with value 1 removed - if .value isn't mentioned" + " : " + newList.removeLast().value);
        System.out.println("This is a node : i.e null returned so not using .value" + " : " + newList.removeLast());
    }
}
