package DS.Stack.Pop;


//LIFO - last in first out.
public class Main {
    public static  void main(String[] arga){
        Stack newStack = new Stack(7);
        System.out.println("The pushed top value of Stack is: ");
        System.out.println(newStack.getTop());
        System.out.println("The height of Stack is: ");
        System.out.println(newStack.getHeight());
        newStack.push(575);
        newStack.push(156);
        System.out.println("After pushing two node into Stack: ");
        newStack.printList();
        System.out.println("After pop of node from Stack: ");
        newStack.pop();
        newStack.printList();
    }
}
