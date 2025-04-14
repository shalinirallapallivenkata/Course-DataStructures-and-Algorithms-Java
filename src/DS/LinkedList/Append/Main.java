package DS.LinkedList.Append;

public class Main {
    public static void main(String[] args){
        LinkedList newList = new LinkedList(4);
        newList.printList();
        System.out.println("This is new appened list");
        newList.appendList(98);
        newList.printList();
    }
}
