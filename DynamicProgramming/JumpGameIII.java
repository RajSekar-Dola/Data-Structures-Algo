public static boolean dynamicPro(int [] arr,int i,boolean [] Dp,int jump){
        if(i >= arr.length || i < 0 || Dp[i]){
            return false;
        }

        if(arr[i] == 0){
            return true;
        }

        //leetcode problem link:
        //https://leetcode.com/problems/jump-game-iii/submissions/1319743348/

        Dp[i] = true;
        boolean a = dynamicPro(arr,i+arr[i],Dp,0);
        boolean b = dynamicPro(arr,i-arr[i],Dp,1);

        return a || b;
    }
    public static boolean canReach(int[] arr, int start) {
        boolean [] Dp = new boolean[arr.length];
        Arrays.fill(Dp,false);
        return dynamicPro(arr,start,Dp,0);
    }
