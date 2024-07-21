 public int minChanges(int n, int k) {
        if((n|k) != n){
            return -1;
        }

        int x = n^k ,c = 0;

        while(x > 0){
            if((x & 1) == 1){
                c++;
            }
            x = x>>1;
        }

        return c;
    }
