import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest
{
  private BinaryTree tree;
  BinarySearchTree binarySearchTree=new BinarySearchTree();

@Test
  public void getTree() {

  BinaryTreeNode root=new BinaryTreeNode(1);
 tree=new BinaryTree(root);
 binarySearchTree.insert(1);
  assertEquals(tree.inOrder(),binarySearchTree.getTree().inOrder());
  }

  @Test
  public void insert() {
  binarySearchTree.insert(1);
  binarySearchTree.insert(3);
  binarySearchTree.insert(30);

  BinarySearchTree binarySearchTree1=new BinarySearchTree();
  binarySearchTree1.insert(1);
  binarySearchTree1.insert(3);
  binarySearchTree1.insert(30);
  assertEquals(binarySearchTree.getTree().inOrder(),binarySearchTree1.getTree().inOrder());
}

@Test
  public void removeElement() {
  int[] list = {1,2,3,4,5,6};
  for (int x = 0; x < list.length; x++)
  {
    binarySearchTree.insert(list[x]);
    binarySearchTree.rebalance();
  }
  binarySearchTree.removeElement(6);
  BinarySearchTree binarySearchTree1=new BinarySearchTree();
  int[] list1 = {1,2,3,4,5};
  for (int x = 0; x < list1.length; x++)
  {
    binarySearchTree1.insert(list1[x]);
    binarySearchTree1.rebalance();
  }
  assertEquals(binarySearchTree.getTree().inOrder(),binarySearchTree1.getTree().inOrder());
  //case 1:no sub node
  BinarySearchTree binarySearchTree2=new BinarySearchTree();
  BinarySearchTree binarySearchTree3=new BinarySearchTree();
  BinarySearchTree binarySearchTree4=new BinarySearchTree();
  int[] list2 = {1,2,3,4,5,6,7,8,9};
  for (int x = 0; x < list2.length; x++)
  {
    binarySearchTree2.insert(list2[x]);
    binarySearchTree2.rebalance();
  }
  binarySearchTree2.removeElement(5);
  int[] list3 = {1,2,3,4,6,7,8,9};

  for (int x = 0; x < list3.length; x++)
  {
   binarySearchTree3.insert(list3[x]);
    binarySearchTree3.rebalance();
  }
  assertEquals(binarySearchTree2.getTree().inOrder(),binarySearchTree3.getTree().inOrder());
  //case2 :one sub root
  binarySearchTree2.insert(5);
  binarySearchTree2.removeElement(7);
  int[] list4={1,2,3,4,5,6,8,9};
  for (int x=0;x<list4.length;x++){
    binarySearchTree4.insert(list4[x]);
    binarySearchTree4.rebalance();
  }
  assertEquals(binarySearchTree2.getTree().inOrder(),binarySearchTree4.getTree().inOrder());
//case3:2 sub nodes

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
BinarySearchTree binarySearchTree1=new BinarySearchTree();
binarySearchTree1.insert(3);
    binarySearchTree1.insert(8);
    binarySearchTree1.insert(5);
    binarySearchTree1.insert(6);
    binarySearchTree1.insert(7);
    binarySearchTree1.rebalance();
assertEquals(binarySearchTree.getTree().inOrder(),binarySearchTree1.getTree().inOrder());}

}
