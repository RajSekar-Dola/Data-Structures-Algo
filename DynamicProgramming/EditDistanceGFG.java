public static int dynamic(String str1,String str2,int i,int j,int [][] Dp){
        if(i == 0){
            return j;
        }

        if(j == 0){
            return i;
        }

        if(Dp[i][j] != -1){
            return Dp[i][j];
        }

        if(str1.charAt(i-1) == str2.charAt(j-1)){
            return Dp[i][j] = dynamic(str1,str2,i-1,j-1,Dp);
        }

        int a = 1 + dynamic(str1,str2,i,j-1,Dp);//INSERT
        int b = 1 + dynamic(str1,str2,i-1,j-1,Dp);//REPLACE
        int c = 1 + dynamic(str1,str2,i-1,j,Dp);//REMOVE

        return Dp[i][j] = Math.min(a,(Math.min(b,c)));
    }
    
    public int editDistance(String str1, String str2) {
        // Code here
        int [][] Dp = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++){
            Arrays.fill(Dp[i],-1);
        }
        return dynamic(str1,str2,str1.length(),str2.length(),Dp);
    }
