package Trees;
class Node{
    int key;
    Node left,right;
    public Node(int item)
    {
        key=item;
        left=right=null;
    }
}
public class traversal {
    public static void main(String args[])
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("\n inorder:");
        inorder(root);
        System.out.println("\n preorder:");
        preorder(root);
        System.out.println("\n postrder:");
        postorder(root);
        
    }
    static void inorder(Node root)
    {
        if(root!=null)
        {
        inorder(root.left);
        System.out.print(root.key+ " ");
        inorder(root.right);
        }
    }
    static void preorder(Node root)
    {
        if(root!=null)
        {
        System.out.print(root.key+ " ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
        System.out.print(root.key+ " ");
        }
    }
}
