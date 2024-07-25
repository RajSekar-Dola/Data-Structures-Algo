public static void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int partition(int [] nums,int low,int high){
        int pivot = nums[high];
        int Pi = low;

        for(int i=low;i<high;i++){
            if(nums[i] <= pivot){
                swap(nums,i,Pi);
                Pi++;
            }
        }
        swap(nums,high,Pi);
        return Pi;
    }

    public static void quickSort(int low,int high,int [] nums){
        if(low < high){
            int Pi = partition(nums,low,high);
            quickSort(low,Pi-1,nums);
            quickSort(Pi+1,high,nums);
        }
    }
