package Trees.basics;
class node{
    node left,right;
    int key;
    node(int k)
    {
        key=k;
    }
}
class traversal{
    public static void main(String args[])
    {
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        System.out.println("inorder");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);
    }
    static void inorder(node root)
    {
        if(root!=null)
        {
        inorder(root.left);
        System.out.println(root.key);
        inorder(root.right);
        }
    }
    static void preorder(node root)
    {
        if(root!=null)
        {
        System.out.println(root.key);
        preorder(root.left);
        preorder(root.right);
        }
    }
    static void postorder(node root)
    {
        if(root!=null)
        {
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.key);
        }
    }
}