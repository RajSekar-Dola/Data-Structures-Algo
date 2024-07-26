boolean kPangram(String str, int k) {
        // GFG LINK:https://www.geeksforgeeks.org/problems/k-pangrams0909/1
        if(str.length() < 26){
            return false;
        }
        
        boolean [] res = new boolean[26];
        int c = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'a' < 26){
                res[str.charAt(i) - 'a'] = true;
                c++;
            }
        }
        
        if(c < 26){
            return false;
        }
        
        for(int i=0;i<26;i++){
            if(!res[i]){
                if(k > 0){
                    k--;
                }else{
                    return false;
                }
            }
        }
        
        return true;
    }
