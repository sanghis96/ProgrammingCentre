/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
        String decoded = "";
        int len = S.length();
        Node temp = root;
        int i=0;
        while(i<len)
        {
            if(Integer.parseInt(""+S.charAt(i++)) == 1)
                temp = temp.right;
            else
                temp = temp.left;
            if(temp.right==null && temp.left==null)
            {
                decoded += temp.data;
                temp = root;
            }
        }
        System.out.println(decoded);
    }
