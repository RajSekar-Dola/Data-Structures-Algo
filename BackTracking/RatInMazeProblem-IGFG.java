 public static void backTracking(int i,int j,int [][] mat,ArrayList<String> res,StringBuilder str){
        if(i >= mat.length || j >= mat[0].length || i < 0 || j < 0 || mat[i][j] == -1 || mat[i][j] == 0){
            return;
        }
        
        if(i == mat.length - 1 && j == mat[0].length - 1){
            if(mat[i][j] == 1){
                res.add(new String(str));
            }
            return;
        }
        
        int temp = mat[i][j];
        mat[i][j] = -1;

        // UP
        str.append('U');
        backTracking(i - 1, j, mat, res, str);
        str.deleteCharAt(str.length() - 1);

        // RIGHT
        str.append('R');
        backTracking(i, j + 1, mat, res, str);
        str.deleteCharAt(str.length() - 1);

        // DOWN
        str.append('D');
        backTracking(i + 1, j, mat, res, str);
        str.deleteCharAt(str.length() - 1);

        // LEFT
        str.append('L');
        backTracking(i, j - 1, mat, res, str);
        str.deleteCharAt(str.length() - 1);

        mat[i][j] = temp;
        
    }
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        backTracking(0,0,mat,res,temp);
        
        if(res.size() == 0){
            res.add("-1");
        }
        
        return res;
    }
