package DS.BinarySearchTree.Contains;

class Node {
    Node left;
    Node right;
    int value;
    public Node(int value){
        this.value = value;
    }

}
public class BinarySearchTree {
    Node root;

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(this.root == null){
            this.root = newNode;
            return true;
        }
        Node temp = this.root;
        while(true){
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left; //m setting new temp i.e; parent node and while runs again
            }
            else{
                if(newNode.value >temp.value){
                    if(temp.right == null){
                        temp.right = newNode;
                        return true;
                    }
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value){
        // Since we are running while with condition temp i.e. root ! null
        // npt adding condition for if temp == null
        Node temp = this.root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }
            if(value > temp.value){
                temp = temp.right;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
