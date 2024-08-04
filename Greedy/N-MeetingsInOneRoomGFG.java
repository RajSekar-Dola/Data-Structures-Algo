 public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int [][] meeting = new int[start.length][2];
        for(int i=0;i<start.length;i++){
            meeting[i][0] = start[i];
            meeting[i][1] = end[i];
        }
        
        Arrays.sort(meeting,(a,b)->a[1] - b[1]);
        int prev = -1 ,res = 0;
        for(int i=0;i<n;i++){
            if(meeting[i][0] > prev){
                res++;
                prev = meeting[i][1];
            }
        }
        
        return res;
    }
