package DS.HashTables.HashTables;

class Node {
    String key;
    int value;
    Node next;

    public Node(String key, int value){
        this.key = key;
        this.value = value;
    }

}

public class HashTable {
    private Node[] dataMap;
    private int size = 7; // initialize this!

    public HashTable(){
        dataMap = new Node[size];
    }

    public void printTable(){
        for(int i=0; i < dataMap.length; i++){ // array 0 to length of table = out of bound exception
            System.out.println("The elements in the datamap Node array are :" + i);
            // Below is the Nodes in the datamap Node array
            Node temp = dataMap[i]; // i iterating so one node for a single iteration hence Node temp
            while(temp != null){
                System.out.println("The Key is" + temp.key + "The values for the keys are : " + temp.value);
                temp = temp.next;
            }
        }
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }


//    public void printTable() {
//        for (Node node : dataMap) {
//            System.out.println(node + ":");
//            if (node != null) {
//                Node temporary = node;
//                while (temporary != null) {
//                    System.out.println("   {" + temporary.key + ", " + temporary.value + "}");
//                    temporary = temporary.next;
//                }
//            }
//        }
//    }
}
