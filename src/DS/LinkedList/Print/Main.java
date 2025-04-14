package DS.LinkedList.Print;

public class Main {
    public static  void main(String[] args){
        LinkedList newList = new LinkedList(4);
        System.out.println("The head value" + " : " + newList.getHead());
        System.out.println("The tail value" + " : " + newList.getTail());
        System.out.println("The length of the Node" + " : " + newList.getLength());

        newList.printList();
    }
}
