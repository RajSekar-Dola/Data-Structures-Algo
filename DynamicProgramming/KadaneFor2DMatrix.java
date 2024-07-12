public class KadaneFor2DMatrix {
    public static int findMax(int [] kadane){
        int currSum = 0 ,globSum = Integer.MIN_VALUE;
        for(int i=0;i< kadane.length;i++){
            currSum = currSum + kadane[i];
            globSum = Math.max(currSum,globSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return globSum;
    }
  //Geeks for geeks Link : https://www.geeksforgeeks.org/problems/maximum-sum-rectangle2948/1
  //for Doubts follow this youTube link
  //https://youtu.be/mKluyW4YFvs?si=pohJ0931phWirzk1
    public static int maximumSumRectangle(int R, int C, int M[][]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<C;i++){
            int [] kadane = new int[R];
            Arrays.fill(kadane,0);
            for(int p=i;p<C;p++){
                for(int row=0;row<R;row++){
                    kadane[row] += M[row][p];
                }
                max = Math.max(max,findMax(kadane));
            }
        }
        return max;
    }
