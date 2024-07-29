public static int findSubSequence(String text1, String text2,int i,int j,int [][] Dp){
  //BACKTRACKING+MEMOIZATION
        if(i >= text1.length() || j >= text2.length()){
            return 0;
        }

        if(Dp[i][j] != -1){
            return Dp[i][j];
        }

        char c1 = text1.charAt(i);
        char c2 = text2.charAt(j);

        if(c1 == c2){
            return Dp[i][j] = 1 + findSubSequence(text1,text2,i+1,j+1,Dp);
        }

        int a = findSubSequence(text1,text2,i+1,j,Dp);
        int b = findSubSequence(text1,text2,i,j+1,Dp);

        return Dp[i][j] = Math.max(a,b);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] Dp = new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            Arrays.fill(Dp[i],-1);
        }

        return findSubSequence(text1,text2,0,0,Dp);
    }



//TABULATION:
 public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dpGrid = new int[n + 1][m + 1];

        for (int row = n - 1; row >= 0; row--) {
            for (int col = m - 1; col >= 0; col--) {
                if (text1.charAt(row) == text2.charAt(col)) {
                    dpGrid[row][col] = 1 + dpGrid[row + 1][col + 1];
                } else {
                    dpGrid[row][col] = Math.max(dpGrid[row + 1][col], dpGrid[row][col + 1]);
                }
            }
        }
        return dpGrid[0][0];
    }
