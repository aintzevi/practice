package data_structures;

public class BinaryTreeMain {
    public static void main(String[] args) {
        // Create tree
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        System.out.println(bt.contains(5));
        bt.add(3);
        System.out.println(bt.contains(3));
        bt.add(1);
        System.out.println(bt.contains(1));
        bt.delete(1);
        System.out.println(bt.contains(1));

        bt.dfsTraversal(bt.getRoot());
    }
}
