public class Test {
    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();



        MyBST myBST = new MyBST();
        // chen
//        myBST.root = myBST.insert(myBST.root, 5);
//        myBST.root = myBST.insert(myBST.root, 1);
//        myBST.root = myBST.insert(myBST.root, 6);
//        myBST.root = myBST.insert(myBST.root, 0);
//        myBST.root = myBST.insert(myBST.root, 3);
//        myBST.root = myBST.insert(myBST.root, 7);
//        myBST.root = myBST.insert(myBST.root, 2);
//        myBST.root = myBST.insert(myBST.root, 4);

        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n2.left = n5;

        myBST.PreOder(n0);

        myBST.preorderTraversal(n0);
        System.out.println("Done");
    }
}
