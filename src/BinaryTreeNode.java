import java.math.MathContext;
import java.util.ArrayList;

public class BinaryTreeNode {

    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;
    private int element;

    public BinaryTreeNode(int element)
    {
        this.element = element;
        leftChild = null;
        rightChild = null;
    }

    public void setElement(int element)
    {
        this.element = element;
    }

    public int getElement()
    {
        return element;
    }

    public void addLeftChild(BinaryTreeNode leftChild)
    {
        this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode rightChild)
    {
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public int size()
    {
        int size = 1;
        if (leftChild!=null)
        {
            size+=leftChild.size();
        }
        if (rightChild!=null)
        {
            size+=rightChild.size();
        }
        return size;
    }

    public boolean contains(int element)
    {
        boolean result = this.element == element;
        if (leftChild!=null)
        {
            result = result||leftChild.contains(element);
        }
        if (rightChild!=null)
        {
            result = result||rightChild.contains(element);
        }
        return result;
    }

    public ArrayList<Integer> inOrder()
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (leftChild!=null)
        {
            list.addAll(leftChild.inOrder());
        }
        list.add(element);
        if (rightChild!=null)
        {
            list.addAll(rightChild.inOrder());
        }
        return list;
    }

    public ArrayList<Integer> preorder()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(element);
        if (leftChild!=null)
        {
            list.addAll(leftChild.preorder());
        }
        if (rightChild!=null)
        {
            list.addAll(rightChild.preorder());
        }
        return list;
    }

    public ArrayList<Integer> postOrder()
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (leftChild!=null)
        {
            list.addAll(leftChild.postOrder());
        }
        if (rightChild!=null)
        {
            list.addAll(rightChild.postOrder());
        }
        list.add(element);
        return list;
    }

    public ArrayList<Integer> getListByHeight(int nodeHeight,int height)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (nodeHeight==height)
        {
            list.add(element);
        }
        else if (nodeHeight>height)
        {
            if (leftChild!=null)
            {
                list.addAll(leftChild.getListByHeight(nodeHeight-1,height));
            }
            if (rightChild!=null)
            {
                list.addAll(rightChild.getListByHeight(nodeHeight-1,height));
            }
        }
        return list;
    }

    public int height()
    {
        int height = 1;
        int leftHeight = 0;
        int rightHeight = 0;
        if (leftChild!=null)
        {
            leftHeight = leftChild.height();
        }
        if (rightChild!=null)
        {
            rightHeight = rightChild.height();
        }
        height += Integer.max(leftHeight,rightHeight);
        return height;
    }
}
