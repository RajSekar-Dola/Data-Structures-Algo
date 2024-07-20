 public Node RemoveHalfNodes(Node root) {
        //GFG LINK : https://www.geeksforgeeks.org/problems/remove-half-nodes/1
         if(root == null)
            return null;
            
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
        
        if(root.left == null && root.right != null)
            return root.right;
        else if(root.left != null && root.right == null)
            return root.left;
            
        return root;
    }
