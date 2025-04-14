package DS.BinarySearchTree.Insert;


class Node {
    Node right;
    Node left;
    int value;
    public Node(int value){
        this.value = value;
    }
}
public class BinarySearchTree {
    Node root;

    public boolean insert(int value){
        Node newNode =  new Node(value);
        if(this.root == null){
            this.root = newNode;
            return true;
        }
        Node temp = this.root;
        if(newNode.value == this.root.value){
            return false;
        }
        while(true){ // using this true for condition in return for the loop to run further
            if(newNode.value < temp.value) { // while comparing only check where to add but if adding a new node add just the node
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left; // changing root if the left of the main parent root is not null
                // since returned true the while is executed
            } // nested if above
            else{
                if(newNode.value > temp.value){
                    if(temp.right == null){
                        temp.right = newNode;
                        return true;
                    }
                }
                temp = temp.right;
            }
        }
    }
}
