public static long findSubarray(long[] arr ,int n) {
        //Your code here
        HashMap<Long,Integer> hm = new HashMap<>();
        hm.put((long)0,1);
        long sum = 0 ,res = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(hm.containsKey(sum)){
                res = res + hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        
        return res;
    }
