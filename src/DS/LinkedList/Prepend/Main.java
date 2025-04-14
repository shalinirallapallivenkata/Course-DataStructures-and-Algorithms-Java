package DS.LinkedList.Prepend;

public class Main {
    public static void main(String[] args){
        LinkedList newList = new LinkedList((1));
        newList.appendList(2);
        System.out.println(newList.removeLast().value + " : " + "First Node remove and returned the value");
        System.out.println(newList.removeLast().value + " : " + "Second Node remove and returned the value");
        System.out.println(newList.removeLast() + " : " + "Returning null when no nodes");
        newList.appendList(1);
        newList.appendList(2);
        newList.prependList(3);
        newList.printList();
    }
}
