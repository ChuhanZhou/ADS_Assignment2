public class BinarySearchTree {
    private BinaryTree tree;

    public BinarySearchTree()
    {
        tree = new BinaryTree(null);
    }

    public BinaryTree getTree() {
        return tree;
    }

    public void insert(int element)
    {
        if (tree.isEmpty())
        {
            tree.setRoot(new BinaryTreeNode(element));
        }
        else if (!tree.contains(element))
        {
            BinaryTreeNode node = tree.getRoot();
            while (true)
            {
                if (node.getElement()>element) {
                    if (node.getLeftChild()==null)
                    {
                        node.addLeftChild(new BinaryTreeNode(element));
                        break;
                    }
                    node = node.getLeftChild();
                }
                else
                {
                    if (node.getRightChild()==null)
                    {
                        node.addRightChild(new BinaryTreeNode(element));
                        break;
                    }
                    node = node.getRightChild();
                }
            }
        }
    }

    public void removeElement(int element)
    {

    }
}
