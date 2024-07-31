public String longestCommonPrefix(String arr[]) {
        // code here
        //GFG LINK:https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
        int maxLen = Integer.MAX_VALUE ,len = 0 ,flag = 1;
        for(int i=0;i<arr.length;i++){
            maxLen = Math.min(maxLen,arr[i].length());
        }
        
        for(int i=0;i<maxLen;i++){
            char c = arr[0].charAt(i);
            for(int j=0;j<arr.length;j++){
                if(arr[j].charAt(i) != c){
                    flag = 0;
                    break;
                }
            }
            if(flag == 0){
                break;
            }
            len++;
        }
        
        return len == 0 ? "-1" : arr[0].substring(0,len);
    }
