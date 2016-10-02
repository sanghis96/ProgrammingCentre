

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
       Node temp = root;
       while(true)
       {
           if(v1<temp.data && v2<temp.data)
               temp = temp.left;
           else if(v1>temp.data && v2>temp.data)
               temp = temp.right;
           else
               return temp;
       }
       
    }




