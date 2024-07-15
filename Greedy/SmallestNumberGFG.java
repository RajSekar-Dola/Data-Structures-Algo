public static boolean greedy(int n,int i,int[] arr,int sum){
        if(sum < 0){
            return false;
        }
        if(n == 0){
            return sum == 0;
        }

        //gfg link:https://www.geeksforgeeks.org/problems/smallest-number5829/1
        for(int x=0;x<=9;x++){
            if(greedy(n-1,i+1,arr,sum-x)){
                arr[i] = x;
                return true;
            }
        }

        return false;
    }
    public static String smallestNumber(int s, int d) {
        int[] arr = new int[d];
        Arrays.fill(arr,-1);

            for(int j=1;j<=9;j++){
                if(greedy(d-1,1,arr,s-j)){
                     arr[0] = j;
                     break;
                }
            }


        StringBuilder x = new StringBuilder();

        if(arr[0] != -1){
            for (int j : arr) {
                char c = (char) (j + '0');
                x.append(c);
            }
        }else{
            return "-1";
        }
        return x.toString();
    }
