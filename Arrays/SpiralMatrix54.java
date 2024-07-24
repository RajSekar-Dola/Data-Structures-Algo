public static List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res = new ArrayList<>();

       int top = 0 ,bottom = matrix.length - 1 ,left = 0 ,right = matrix[0].length - 1 ,id = 0;

       while(top <= bottom && left <= right){
           if(id == 0){
               for(int x=left;x<=right;x++){
                   res.add(matrix[top][x]);
               }
               top++;
           }

           if(id == 1){
               for(int x=top;x<=bottom;x++){
                   res.add(matrix[x][right]);
               }
               right--;
           }

           if(id == 2){
               for(int x=right;x>=left;x--){
                   res.add(matrix[bottom][x]);
               }
               bottom--;
           }

           if(id == 3){
               for(int x=bottom;x>=top;x--){
                   res.add(matrix[x][left]);
               }
               left++;
           }

           id = (id + 1)%4;
       }

       return res;
    }
