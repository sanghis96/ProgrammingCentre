import java.util.*;
import java.io.*;

class Node
{
    Node left,right;
    int data;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class Day23
{
    private static Node[] queue = new Node[50];
    private static int f=-1,r=-1;
    private static void enQueue(Node n)
    {
        if(f==-1 && r==-1)
        {
            queue[++r] = n;
            f++;
        }
        else
            queue[++r] = n;
    }
    private static Node deQueue()
    {
        Node n = queue[f];
        if(f == r)
            f = r = -1;
        else
            f++;
        return n;
    }
    private static void levelOrder(Node root)
    {
        Node temp;
        if(root == null)
            return;
        enQueue(root);
        
        while(f!=-1 && r!=-1)        // Queue empty condition
        {
            temp = deQueue();
            System.out.print(temp.data + " ");
            if(temp.left != null)
                enQueue(temp.left);
            if(temp.right != null)
                enQueue(temp.right);
        }
    }
    public static Node insert(Node root, int data)
    {
        if(root == null)
            return new Node(data);
        else
        {
            Node cur;
            if(data <= root.data)
            {
                cur=insert(root.left,data);
                root.left=cur;
            }
            else 
            {
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while(T-- > 0)
        {
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}
