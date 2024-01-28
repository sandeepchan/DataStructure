package Traversal;

public class TreeNodeEx {
    int data;
    TreeNodeEx left;
    TreeNodeEx right;

    public TreeNodeEx(int data) {
        this.data = data;
    }

    public static void Inorder(TreeNodeEx root)
    {
        if(root == null)
        {
             return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);


    }

    public static void preorder(TreeNodeEx root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void postOrder(TreeNodeEx root)
    {
        if(root == null)
        {
            return;
        }


        Inorder(root.left);
        Inorder(root.right);
        System.out.print(root.data);
    }

    public static  int heightofTree(TreeNodeEx treeNodeEx){
        if(treeNodeEx == null)
        {
            return  0;
        }

        return Math.max(heightofTree(treeNodeEx.left), heightofTree(treeNodeEx.right))  + 1;

    }


    public static void kthnode(TreeNodeEx treeNodeEx, int k)
    {
        if(treeNodeEx == null)
        {
            return;
        }
        if(k == 0)
        {
            System.out.println(treeNodeEx.data);
            return;
        }
        else {
            kthnode(treeNodeEx.left, k-1);
            kthnode(treeNodeEx.right, k-1);
        }
    }

    public static void leafNode(TreeNodeEx treeNodeEx)
    {
        if(treeNodeEx.right == null || treeNodeEx.left == null)
        {
            System.out.println(treeNodeEx.data);
            return;
        }
        else {
            leafNode(treeNodeEx.left);
            leafNode(treeNodeEx.right);
        }

    }

    public static int size(TreeNodeEx treeNodeEx)
    {
        if(treeNodeEx == null)
        {
            return 0;
        }
        return  1 + size(treeNodeEx.left) + size(treeNodeEx.right);

    }

    public static int maxItem(TreeNodeEx treeNodeEx)
    {
        if(treeNodeEx.left == null || treeNodeEx.right == null)
        {
            return  treeNodeEx.data;
        }
        return  Math.max(maxItem(treeNodeEx.left), maxItem(treeNodeEx.right));
    }

    public static void printLeftView(TreeNodeEx treeNodeEx)
    {
        if(treeNodeEx == null)
        {
            return;
        }
        printLeftView(treeNodeEx.left);
        printLeftView(treeNodeEx.right);

    }
}
