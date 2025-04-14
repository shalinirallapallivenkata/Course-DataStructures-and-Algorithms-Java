package DS.Stack.Impl;

public class Main {
    public static  void main(String[] arga){
        Stack newStack = new Stack(7);
        System.out.println("The pushed top value of Stack is: ");
        System.out.println(newStack.getTop());
        System.out.println("The height of Stack is: ");
        System.out.println(newStack.getHeight());

    }
}
