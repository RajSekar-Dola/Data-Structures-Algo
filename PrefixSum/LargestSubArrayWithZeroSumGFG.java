int maxLen(int arr[], int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        
        int res = 0,s=0;
        for(int i=0;i<n;i++){
            s = arr[i] + s;
            if(hm.containsKey(s)){
                res = Math.max(res,i-hm.get(s));
            }else{
                hm.put(s,i);
            }
        }
        
        return res;
    }
