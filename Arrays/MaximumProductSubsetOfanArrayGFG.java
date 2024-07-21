public long findMaxProduct(List<Integer> arr) {
        //GFG LINK:https://www.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1
        // code here
        int mini = Integer.MIN_VALUE;
        long prod = 1,x = 0 ,y = 0 ,z =0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) < 0){
                x++;
                mini = Math.max(mini,arr.get(i));
            }
            if(arr.get(i) != 0){
                prod = prod * arr.get(i);
                prod = prod % 1000000007;
                z++;
            }else{
                y++;
            }
        }
        
        if(x == 1 && y > 0 && z == 0){
            return 0;
        }
        
        if(prod < 0){
            prod = prod / mini;
        }
        
        return prod;
    }
