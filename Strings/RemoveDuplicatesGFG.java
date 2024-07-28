String removeDups(String str) {
        // code here
        int [] count = new int[26];
        StringBuilder s = new StringBuilder(str);
        Arrays.fill(count,0);
        
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i) - 'a'] > 0){
                s.deleteCharAt(i);
                i--;
            }else{
                count[s.charAt(i) - 'a']++;
            }
        }
        
        return s.toString();
    }
