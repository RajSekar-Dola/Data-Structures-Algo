class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        String p = "../";
        String s = "./";
        for(int i=0;i<logs.length;i++){
            if(p.compareTo(logs[i]) == 0){
                if(count != 0){
                    count--;
                }
            }else if(s.compareTo(logs[i]) == 0){
                continue;
            }else{
                count++;
            }
        }

        return count;
    }
}
