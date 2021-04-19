package Trees.basics;

class node {
    node left;
    node right;
    int key;

    node(int k) {
        key = k;
    }
}

public class distanceFromRoot {
    public static void main(String args[]) {
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.left.left=new node(40);
        root.left.right=new node(50);
        System.out.println(findDistanceFromRoot(root,30));
    }
    static int  findDistanceFromRoot(node root,int x)
    {
        if(root==null)
        {
            return -1;
        }
        int distance=0;
        if((root.key==x)
        || (distance=findDistanceFromRoot(root.left, x))>=0
        || (distance=findDistanceFromRoot(root.right, x))>=0
        )
        {
            return distance+1;
        }
        return distance;

    }

}
