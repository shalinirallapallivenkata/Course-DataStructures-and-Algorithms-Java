package DS.Queue.Impl;

public class Main {
    public static void main(String[] args){
        Queue newQueue = new Queue(45);
        System.out.println("The First value of Queue is : " + newQueue.getFirst());
        System.out.println("The Last value of Queue is : " + newQueue.getLast());
        System.out.println("The Lengthof Queue is : " + newQueue.getLength());

    }
}
