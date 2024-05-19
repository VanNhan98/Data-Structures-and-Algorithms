import java.util.ArrayList;
import java.util.List;

public class MyBST {
    public TreeNode root;

    public MyBST() {
    }


    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);

        if (root == null) {
          root = newNode;
         return root;
        }
        else {
            if (value < root.val) {
                if (root.left == null) {
                    root.left = newNode;
                }
                else {
                    insert(root.left, value);
                }
            } else {
                if (root.right == null) {
                    root.right = newNode;
                } else {
                    insert(root.right, value);
                }
            }
            return root;
        }


    }

    public TreeNode findlastLeftNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftMosteNode = root;
        while (leftMosteNode.left!= null) {
            leftMosteNode = leftMosteNode.left;
        }
        return leftMosteNode;

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key  > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left != null && root.right == null) {
                return root.left;
            }
            if (root.right != null && root.left == null) {
                return root.right;
            }

            TreeNode lastLeftNode = findlastLeftNode(root.right);
            root.val = lastLeftNode.val;
            root.right = deleteNode(root.right, lastLeftNode.val);
        }
        return root;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        if(val < root.val) {
            return searchBST(root.left, val);
        }
        else if(val > root.val) {
            return searchBST(root.right, val);
        }
        else {
            return root;
        }
    }


    // N - L - R
    public static void PreOder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        PreOder(root.left);
        PreOder(root.right);
    }

    List<Integer> listPreOder = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return listPreOder;
        listPreOder.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return listPreOder;
    }


}
