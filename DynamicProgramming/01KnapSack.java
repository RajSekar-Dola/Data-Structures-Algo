public static int DynamicPro(int val[],int wt [],int i,int rem,int [][] Dp){
        if(i == wt.length-1){
            if(rem >= wt[i]){
                return val[i];
            }else {
                return 0;
            }
        }
        //GFG problem link
        //https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
        if(Dp[i][rem] != -1){
            return Dp[i][rem];
        }

        int a = Integer.MIN_VALUE ,b = Integer.MIN_VALUE;
        if(rem < wt[i]){
            //don't pick
            a = DynamicPro(val,wt,i+1,rem,Dp);
        }else{
            //pick and don't pick
            b = Math.max(val[i] + DynamicPro(val,wt,i+1,rem-wt[i],Dp),DynamicPro(val,wt,i+1,rem,Dp));
        }

        return Dp[i][rem] = Math.max(a,b) != Integer.MIN_VALUE ? Math.max(a,b) : 0;
    }


     public static int knapSack01(int W, int wt[], int val[], int n){
        int [][] Dp = new int[n][W+1];
         for(int i=0;i<n;i++){
             Arrays.fill(Dp[i],-1);
         }
        return DynamicPro(val,wt,0,W,Dp);
    }
