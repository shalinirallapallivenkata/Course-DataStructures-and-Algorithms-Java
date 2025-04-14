package DS.HashTables.HashTables;

public class Main {
    public static void main (String[] args){
        HashTable newTable = new HashTable();
        newTable.setSize(7);
        System.out.println(newTable.getSize());
       newTable.printTable();
    }
}
