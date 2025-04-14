package DS.BinarySearchTree.Insert;


public class Main {
    public static void main(String[] args){
        BinarySearchTree newTree = new BinarySearchTree();
        System.out.println("With0ut adding children the root points to null : Hence value of new tree is : " + newTree.root);
        newTree.insert(47);
        newTree.insert(21);
        newTree.insert(76);
        newTree.insert(18);
        newTree.insert(27);
        newTree.insert(52);
        newTree.insert(82);
        System.out.println("The root/ parent Node is : " + newTree.root.value);
        System.out.println("The first left child is : " + newTree.root.left.value);
        System.out.println("The first right child is : " + newTree.root.right.value);
        System.out.println("The first right child's children are : " + " Towards left : " + newTree.root.right.left.value +
                " & " + " Towards right : " + newTree.root.right.right.value);
        System.out.println("The first left child's children are : " + " Towards left : "+ newTree.root.left.left.value
                + " & " +  " Towards right : " + newTree.root.left.right.value);
    }
}
