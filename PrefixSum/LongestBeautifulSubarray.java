public static int longestSubarray(int n, int[] arr) {
        // code here
        //gfg link:https://practice.geeksforgeeks.org/contest/gfg-weekly-163-rated-contest/problems
        HashMap<Integer,Integer> hm = new HashMap<>();
        int mask = 0,max = 0;
        
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            mask = mask ^ arr[i];
            if(hm.containsKey(mask)){
                max = Math.max(max,i-hm.get(mask));
            }else{
                hm.put(mask,i);
            }
        }
        
        return max;
    }
