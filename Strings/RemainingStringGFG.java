  public String printString(String s, char ch, int count) {
        // code here
        if(count == 0){
            return s;
        }
        //gfg link:https://www.geeksforgeeks.org/problems/remaining-string3515/1
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch){
                count--;
            }
            
            if(count == 0){
                return s.substring(i+1,s.length());
            }
        }
        
        return "";
    }
