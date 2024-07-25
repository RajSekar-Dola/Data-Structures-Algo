public static void Merge(int l, int mid, int r, int[] nums) {
        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= r) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[l + x] = temp[x];
        }
    }

    public static void sort(int l, int r, int nums[]) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(l, mid, nums);
            sort(mid + 1, r, nums);
            Merge(l, mid, r, nums);
        }
    }

    public int[] sortArray(int[] nums) {
        sort(0, nums.length - 1, nums);
        return nums;
    }
