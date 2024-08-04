 public static int maxChain(int[][] pairs, int prev, int i, int[][] Dp) {
        if (i == pairs.length) {
            return 0;
        }

        if (Dp[i][prev + 1001] != -1) {
            return Dp[i][prev + 1001];
        }

        int a = 0;
        if (prev == -1001 || prev < pairs[i][0]) {
            a = 1 + maxChain(pairs, pairs[i][1], i + 1, Dp);
        }
        int b = maxChain(pairs, prev, i + 1, Dp);

        return Dp[i][prev + 1001] = Math.max(a, b);
    }

    public int findLongestChain(int[][] pairs) {
        int[][] Dp = new int[pairs.length][2002];
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < pairs.length; i++) {
            Arrays.fill(Dp[i], -1);
        }
        return maxChain(pairs, -1001, 0, Dp);
    }
