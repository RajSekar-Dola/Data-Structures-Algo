public static void swap(int[] arr ,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void segregate0and1(int[] arr) {
        // code here
        //gfg link:https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
        int i= 0 ,j = arr.length-1;
        while(i < j){
            while(i < j && arr[i] == 0){
                i++;
            }
            while(i < j && arr[j] == 1){
                j--;
            }
            if(arr[i] != 0 && arr[j] != 1){
                swap(arr,i,j);
            }
            j--;
            i++;
        }
    }
