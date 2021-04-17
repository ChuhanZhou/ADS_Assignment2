import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {
    private BinaryTreeNode root;
    BinaryTree binaryTree = new BinaryTree(root);

    @Test
    public void getRoot() {
        assertEquals(root, binaryTree.getRoot());
    }

    @Test
    public void setRoot() {
        binaryTree.setRoot(root);
        assertEquals(root, binaryTree.getRoot());
    }

    @Test
    public void isEmpty() {
        assertEquals(true, binaryTree.isEmpty());
    }

    @Test
    public void size() {
        root = new BinaryTreeNode(1);
        binaryTree.setRoot(root);
        assertEquals(1, binaryTree.size());
    }

    @Test
    public void contains() {
        root = new BinaryTreeNode(1);
        binaryTree.setRoot(root);
        assertEquals(true, binaryTree.contains(1));
    }

    @Test
    public void inOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        root = new BinaryTreeNode(0);
        binaryTree.setRoot(root);
        assertEquals(list, binaryTree.inOrder());
    }

    @Test
    public void preorder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        root = new BinaryTreeNode(0);
        binaryTree.setRoot(root);
        assertEquals(list, binaryTree.preorder());
    }

    @Test
    public void postOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        root = new BinaryTreeNode(0);
        binaryTree.setRoot(root);
        assertEquals(list, binaryTree.postOrder());
    }

    @Test
    public void levelOrder() {
        root = new BinaryTreeNode(1);
        binaryTree.setRoot(root);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        assertEquals(list, binaryTree.levelOrder());
    }

    @Test
    public void height() {
        assertEquals(-1, binaryTree.height());
    }
}
