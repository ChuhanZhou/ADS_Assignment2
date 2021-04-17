import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeNodeTest {
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    int element;
    BinaryTreeNode binaryTreeNode = new BinaryTreeNode(element);

    @Test
    public void setElement() {
        int element = 3;
        binaryTreeNode.setElement(element);
        assertEquals(element, binaryTreeNode.getElement());

    }

    @Test
    public void getElement() {
        assertEquals(element, binaryTreeNode.getElement());
    }

    @Test
    public void addLeftChild() {
        binaryTreeNode.addLeftChild(leftChild);
        assertEquals(leftChild, binaryTreeNode.getLeftChild());
    }

    @Test
    public void addRightChild() {
        binaryTreeNode.addRightChild(rightChild);
        assertEquals(rightChild, binaryTreeNode.getRightChild());
    }

    @Test
    public void getLeftChild() {
        assertEquals(leftChild, binaryTreeNode.getLeftChild());
    }

    @Test
    public void getRightChild() {
        assertEquals(rightChild, binaryTreeNode.getRightChild());
    }

    @Test
    public void size() {

        assertEquals(1, binaryTreeNode.size());
    }

    @Test
    public void contains() {
        element = 1;
        binaryTreeNode.contains(element);
        assertEquals(false, binaryTreeNode.contains(element));
    }

    @Test
    public void inOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        assertEquals(list, binaryTreeNode.inOrder());
    }

    @Test
    public void preorder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(element);
        assertEquals(list, binaryTreeNode.preorder());
    }

    @Test
    public void postOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(element);
        assertEquals(list, binaryTreeNode.postOrder());
    }

    @Test
    public void getListByHeight() {
        int nodeHeight = 0;
        int height = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        assertEquals(list, binaryTreeNode.getListByHeight(nodeHeight, height));
    }

    @Test
    public void height() {

        assertEquals(1, binaryTreeNode.height());
    }

    @Test
    public void balanceValue() {

        assertEquals(0, binaryTreeNode.balanceValue());
    }
}




