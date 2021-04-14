import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest
{
  private BinaryTree tree;
  BinarySearchTree binarySearchTree=new BinarySearchTree();
@Test
  public void getTree() {
 // BinaryTreeNode root=new BinaryTreeNode(1);
 //tree=new BinaryTree(root);
 binarySearchTree.insert(1);
  assertEquals(tree,binarySearchTree.getTree());
  }

  @Test
  public void insert() {
  int element=2;
  binarySearchTree.insert(element);
  assertEquals(2,binarySearchTree.getTree().getRoot().getElement());
}

@Test
  public void removeElement() {
  binarySearchTree.insert(1);
  binarySearchTree.insert(2);
  binarySearchTree.insert(7);
  binarySearchTree.removeElement(2);
  assertEquals(1,binarySearchTree.getTree().getRoot().getElement());
  }
  @Test
  public void findMin() {
    binarySearchTree.insert(1);
    binarySearchTree.insert(2);
    assertEquals(1,binarySearchTree.findMin());
  }
  @Test
  public void findMax() {
    binarySearchTree.insert(1);
    binarySearchTree.insert(2);
    assertEquals(2,binarySearchTree.findMax());
  }
  @Test
  public void rebalance() {
  binarySearchTree.insert(3);
  binarySearchTree.insert(8);
binarySearchTree.insert(5);
binarySearchTree.insert(6);
binarySearchTree.insert(7);
binarySearchTree.rebalance();
assertEquals(6,binarySearchTree.getTree().getRoot().getElement());}

}
