 public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i = 0 ,j = 0 ,x = 0;
        long res = -1;
        while(i < n && j < m && x < k){
            if(arr1[i] <= arr2[j]){
                res = arr1[i];
                i++;
                x++;
            }else{
                res = arr2[j];
                j++;
                x++;
            }
        }
        
        while(i < n && x < k){
            res = arr1[i];
            i++;
            x++;
        }
        
        while(j < m && x < k){
            res = arr2[j];
            j++;
            x++;
        }
        
        return res;
    }
