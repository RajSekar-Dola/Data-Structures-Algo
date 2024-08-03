public int celebrity(int mat[][]) {
        // code here
        //USING GRAPH:
        int [] InDegree = new int[mat.length];
        int [] OutDegree = new int[mat.length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    InDegree[j] += 1;
                    OutDegree[i] += 1;
                }
            }
        }
        
        for(int i=0;i<mat.length;i++){
            if(InDegree[i] == mat.length-1 && OutDegree[i] == 0){
                return i;
            }
        }
        
        return -1;
    }
