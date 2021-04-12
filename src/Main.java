public class Main {
    public static void main(String[] args) {
        //BinaryTreeNode root = new BinaryTreeNode(1);
        //root.addLeftChild(new BinaryTreeNode(2));
        //root.addRightChild(new BinaryTreeNode(3));
        //root.getLeftChild().addLeftChild(new BinaryTreeNode(4));
        //root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        //root.getRightChild().addLeftChild(new BinaryTreeNode(6));
        //root.getRightChild().addRightChild(new BinaryTreeNode(7));
        //root.getLeftChild().getLeftChild().addLeftChild(new BinaryTreeNode(8));
        //root.getLeftChild().getLeftChild().addRightChild(new BinaryTreeNode(9));
        //root.getLeftChild().getRightChild().addLeftChild(new BinaryTreeNode(10));
        //root.getLeftChild().getRightChild().addRightChild(new BinaryTreeNode(11));
        //root.getRightChild().getLeftChild().addLeftChild(new BinaryTreeNode(12));
        //root.getRightChild().getLeftChild().addRightChild(new BinaryTreeNode(13));
        //root.getRightChild().getRightChild().addLeftChild(new BinaryTreeNode(14));
        //root.getRightChild().getRightChild().addRightChild(new BinaryTreeNode(15));
        //root.getLeftChild().getLeftChild().getLeftChild().addLeftChild(new BinaryTreeNode(16));
        //BinaryTree tree = new BinaryTree(root);
        //BinaryTreePrint print = new BinaryTreePrint();
        //print.printTree(root);
        //System.out.println("\n");
        //System.out.println(tree.size());
        //System.out.println(tree.height());
        //System.out.println("inOrder:"+tree.inOrder());
        //System.out.println("preorder:"+tree.preorder());
        //System.out.println("postOrder:"+tree.postOrder());
        //System.out.println("levelOrder:"+tree.levelOrder());
        BinarySearchTree searchTree = new BinarySearchTree();
        int[] list = {17,19,12,10,15,13,16,19,20,33,22};
        for (int x=0;x<list.length;x++)
        {
            searchTree.insert(list[x]);
        }
        BinaryTreePrint print = new BinaryTreePrint();
        print.printTree(searchTree.getTree().getRoot());
        System.out.println("\n");
    }
}
