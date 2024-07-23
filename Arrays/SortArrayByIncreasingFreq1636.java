public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Integer[] freq = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            freq[i] = nums[i];
        }

        Arrays.sort(freq, (a, b) -> {
            if (hm.get(a) != hm.get(b)) {
                return hm.get(a) - hm.get(b);
            } else {
                return b - a;
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = freq[i];
        }

        return nums;
    }
