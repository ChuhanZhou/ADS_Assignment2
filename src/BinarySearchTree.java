public class BinarySearchTree {
    private BinaryTree tree;

    public BinarySearchTree() {
        tree = new BinaryTree(null);
    }

    public BinaryTree getTree() {
        return tree;
    }

    public void insert(int element) {
        if (tree.isEmpty()) {
            tree.setRoot(new BinaryTreeNode(element));
        } else if (!tree.contains(element)) {
            BinaryTreeNode node = tree.getRoot();
            while (true) {
                if (node.getElement() > element) {
                    if (node.getLeftChild() == null) {
                        node.addLeftChild(new BinaryTreeNode(element));
                        break;
                    }
                    node = node.getLeftChild();
                } else {
                    if (node.getRightChild() == null) {
                        node.addRightChild(new BinaryTreeNode(element));
                        break;
                    }
                    node = node.getRightChild();
                }
            }
        }
    }

    public void removeElement(int element) {
        if (!tree.isEmpty() && tree.contains(element)) {
            BinaryTreeNode superNode = null;
            BinaryTreeNode node = tree.getRoot();
            BinaryTreeNode replaceNode = null;
            //find the location of remove node
            while (true) {
                if (node.getElement() > element)
                {
                    superNode = node;
                    node = node.getLeftChild();
                }
                else if(node.getElement() == element)
                {
                    break;
                }
                else
                {
                    superNode = node;
                    node = node.getRightChild();
                }
            }
            //determine the number of sub node
            if (node.getLeftChild()==null&&node.getRightChild()==null)
            {
                //have no sub node, no replace node
            }
            else if (node.getLeftChild()!=null&&node.getRightChild()==null||node.getLeftChild()==null&&node.getRightChild()!=null)
            {
                //have one sub node
                if (node.getLeftChild()!=null)
                {
                    replaceNode = node.getLeftChild();
                }
                else
                {
                    replaceNode = node.getRightChild();
                }
            }
            else
            {
                //have two sub node
                BinaryTreeNode superNodeOfRightMin = node;
                BinaryTreeNode rightMinNode = node.getRightChild();
                while (rightMinNode.getLeftChild()!=null)
                {
                    superNodeOfRightMin = rightMinNode;
                    rightMinNode = rightMinNode.getLeftChild();
                }
                if (superNodeOfRightMin.getLeftChild()==rightMinNode)
                {
                    superNodeOfRightMin.addLeftChild(rightMinNode.getRightChild());
                }
                else
                {
                    superNodeOfRightMin.addRightChild(rightMinNode.getRightChild());
                }
                rightMinNode.addLeftChild(node.getLeftChild());
                rightMinNode.addRightChild(node.getRightChild());
                replaceNode = rightMinNode;
            }
            //remove node
            if (superNode!=null)
            {
                if (superNode.getLeftChild()==node)
                {
                    superNode.addLeftChild(replaceNode);
                }
                else
                {
                    superNode.addRightChild(replaceNode);
                }
            }
            else
            {
                tree.setRoot(replaceNode);
            }
        }
    }

    public int findMin() {
        BinaryTreeNode node = tree.getRoot();
        while (node.getLeftChild() != null) {
            node = node.getLeftChild();
        }
        return node.getElement();
    }

    public int findMax() {
        BinaryTreeNode node = tree.getRoot();
        while (node.getRightChild() != null) {
            node = node.getRightChild();
        }
        return node.getElement();
    }

    public void rebalance() {
        if (tree != null && !tree.isEmpty()) {
            while (tree.getRoot().balanceValue() >1 || tree.getRoot().balanceValue() < -1) {
                BinaryTreeNode superNode = tree.getRoot();
                BinaryTreeNode node = null;
                if (superNode.balanceValue() < -1) {
                    node = superNode.getLeftChild();
                } else if (superNode.balanceValue() > 1) {
                    node = superNode.getRightChild();
                }

                if (node != null) {
                    BinaryTreeNode superSuperNode = null;
                    while (true) {
                        if (node.balanceValue() < -1 && node.getLeftChild().balanceValue() != 0) {
                            superSuperNode = superNode;
                            superNode = node;
                            node = node.getLeftChild();
                        } else if (node.balanceValue() > 1 && node.getRightChild().balanceValue() != 0) {
                            superSuperNode = superNode;
                            superNode = node;
                            node = node.getRightChild();
                        } else {
                            break;
                        }
                    }
                    //balance
                    if (superNode.getLeftChild()==node) {
                        if (node.balanceValue() > 0) {
                            BinaryTreeNode subNode = node.getRightChild();
                            node.addRightChild(subNode.getLeftChild());
                            subNode.addLeftChild(node);
                            superNode.addLeftChild(subNode);
                        } else {
                            superNode.addLeftChild(node.getRightChild());
                            node.addRightChild(superNode);
                            if (superSuperNode != null) {
                                if (superSuperNode.getLeftChild()==superNode) {
                                    superSuperNode.addLeftChild(node);
                                } else {
                                    superSuperNode.addRightChild(node);
                                }
                            } else {
                                tree.setRoot(node);
                            }
                        }
                    } else {
                        if (superNode.getRightChild()==node) {
                            if (node.balanceValue() < 0) {
                                BinaryTreeNode subNode = node.getLeftChild();
                                node.addLeftChild(subNode.getRightChild());
                                subNode.addRightChild(node);
                                superNode.addRightChild(subNode);
                            } else {
                                superNode.addRightChild(node.getLeftChild());
                                node.addLeftChild(superNode);
                                if (superSuperNode != null) {
                                    if (superSuperNode.getRightChild()==superNode) {
                                        superSuperNode.addRightChild(node);
                                    } else {
                                        superSuperNode.addLeftChild(node);
                                    }
                                } else {
                                    tree.setRoot(node);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

