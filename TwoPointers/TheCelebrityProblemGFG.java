public int celebrity(int mat[][]) {
        // code here
        //USING TWO-POINTERS:
        int i = 0,j = mat.length - 1;
        while(i < j){
            if(mat[i][j] == 1){
                i++;
            }else{
                j--;
            }
        }
        
        for(i=0;i<mat.length;i++){
            if((i != j) && (mat[i][j] != 1 || mat[j][i] == 1)){
                return -1;
            }
        }
        
        return j;
    }
