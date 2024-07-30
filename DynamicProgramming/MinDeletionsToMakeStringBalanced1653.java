public int minimumDeletions(String s) {
        int[] left = new int[s.length()];
        int[] right = new int[s.length()];

        left[0] = 0;
        right[s.length() - 1] = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'b') {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = left[i - 1];
            }

            if (s.charAt(s.length() - i) == 'a') {
                right[s.length() - i - 1] = right[s.length() - i] + 1;
            } else {
                right[s.length() - i - 1] = right[s.length() - i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            min = Math.min(left[i] + right[i], min);
        }

        return min;
    }
