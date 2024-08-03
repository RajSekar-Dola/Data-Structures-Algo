public int celebrity(int mat[][]) {
        // code here
        //USING STACK:
        Stack<Integer> st = new Stack<>();
        int n = mat.length;
        for(int i=0;i<n;i++){
            st.push(i);
        }
        
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            if(mat[a][b] == 1){
                st.push(b);
            }else{
                st.push(a);
            }
        }
        
        int c = st.pop();
        for(int i=0;i<n;i++){
            if(i != c && (mat[i][c] != 1 || mat[c][i] == 1)){
                return -1;
            }
        }
        
        return c;
    }
