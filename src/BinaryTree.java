import java.util.ArrayList;

public class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root)
    {
        this.root = root;
    }

    public BinaryTreeNode getRoot()
    {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root==null;
    }

    public int size()
    {
        return root.size();
    }

    public boolean contains(int element)
    {
        if (root!=null)
        {
            return root.contains(element);
        }
        return false;
    }

    public ArrayList<Integer> inOrder()
    {
        return root.inOrder();
    }

    public ArrayList<Integer> preorder()
    {
        return root.preorder();
    }

    public ArrayList<Integer> postOrder()
    {
        return root.postOrder();
    }

    public ArrayList<Integer> levelOrder()
    {
        ArrayList<Integer> list = new ArrayList<>();
        int height = height();
        for (int x=height;x>0;x--)
        {
            list.addAll(root.getListByHeight(height,x));
        }
        return list;
    }

    public int height()
    {
        if (root==null)
        {
            return -1;
        }
        return root.height();
    }
}
