package DS.LinkedList.RemoveFirst;

public class Main {
    public static  void main(String[] args){
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
    }
}
