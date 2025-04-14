package DS.HashTables.HashTables.HashMethod;


import java.lang.invoke.StringConcatException;

class Node {
    String key;
    int value;
    Node next;

    public Node(int value, String key){
        this.value = value;
        this.key = key;
    }
}
public class HashTable {
    Node[] dataMap;
    int size = 7;

    public HashTable(){
        dataMap = new Node[size];
    }

    public void printTable(){
        for(int i = 0; i< dataMap.length ; i++){
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println("The key is :" + temp.key + "The value is :" + temp.value);
                temp = temp.next;
            }
        }
    }

    3
}
