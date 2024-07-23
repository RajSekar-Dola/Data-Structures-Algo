public static void inorder(Node root,List<Integer> temp){
        if(root == null){
            return;
        }
        inorder(root.left,temp);
        temp.add(root.data);
        inorder(root.right,temp);
    }
    
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        //GFG LINK : https://www.geeksforgeeks.org/problems/merge-two-bst-s/1
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        inorder(root1,temp1);
        inorder(root2,temp2);
        
        int i=0,j=0;
        
        while(i < temp1.size() && j < temp2.size()){
            if(temp1.get(i) <= temp2.get(j)){
                res.add(temp1.get(i));
                i++;
            }else{
                res.add(temp2.get(j));
                j++;
            }
        }
        
        while(i < temp1.size()){
            res.add(temp1.get(i));
            i++;
        }
        
        while(j < temp2.size()){
            res.add(temp2.get(j));
            j++;
        }
        
        return res;
    }
