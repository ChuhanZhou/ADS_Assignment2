import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePrintTest
{
  BinaryTreeNode root;
  BinaryTreePrint binaryTreePrint=new BinaryTreePrint();
@Test
  public void printTree() {
    root=new BinaryTreeNode(1);
  ArrayList<BinaryTreeNode> parent = new ArrayList<BinaryTreeNode>();
  parent.add(root);
  binaryTreePrint.printTree(root);
}

}
