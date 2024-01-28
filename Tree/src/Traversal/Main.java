package Traversal;


public class Main {

    public static void main(String[] args) {

        TreeNodeEx treeNodeEx = new TreeNodeEx(1);
        treeNodeEx.left = new TreeNodeEx(2);
        treeNodeEx.right = new TreeNodeEx(3);
        treeNodeEx.left.left = new TreeNodeEx(4);
        treeNodeEx.left.right = new TreeNodeEx(5);
        treeNodeEx.right.left = new TreeNodeEx(60);
        treeNodeEx.right.right = new TreeNodeEx(7);

        System.out.println("Inorder");
        TreeNodeEx.Inorder(treeNodeEx);
        System.out.println("\nPre Order");
        TreeNodeEx.preorder(treeNodeEx);
        System.out.println("\nPost  Order");
        TreeNodeEx.postOrder(treeNodeEx);

        System.out.println("height is" + TreeNodeEx.heightofTree(treeNodeEx));

        System.out.println("Kth node ");
        TreeNodeEx.kthnode(treeNodeEx, 2);
        System.out.println("leaf node");
        TreeNodeEx.leafNode(treeNodeEx);

        System.out.println("Size of tree " + TreeNodeEx.size(treeNodeEx));

        System.out.println("Max in tree " + TreeNodeEx.maxItem(treeNodeEx));

    }
}
