 public static long Dynamic(int [] coins,int i,int sum,long [][] Dp){
        if(i >= coins.length || sum < 0){
            return 0;
        }

        if(sum == 0){
            return 1;
        }

        if(Dp[i][sum] != -1){
            return Dp[i][sum];
        }

        long take = Dynamic(coins,i,sum-coins[i],Dp);
        long notTake = Dynamic(coins,i+1,sum,Dp);

       return Dp[i][sum] = take+notTake;
    }
    
    public long count(int coins[], int N, int sum) {
       long [][] Dp = new long[N][sum+1];
       for(int i=0;i<N;i++){
           Arrays.fill(Dp[i],-1);
       }
       //GFG LINK: https://www.geeksforgeeks.org/problems/coin-change2448/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
       return  Dynamic(coins,0,sum,Dp);
    }
