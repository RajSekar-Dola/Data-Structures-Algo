class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        Arrays.fill(row, Integer.MAX_VALUE);
        Arrays.fill(col, Integer.MIN_VALUE);

        HashSet<Integer> x1 = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                row[i] = Math.min(row[i], matrix[i][j]);
                col[j] = Math.max(col[j], matrix[i][j]);
            }
            x1.add(row[i]);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (x1.contains(col[i])) {
                res.add(col[i]);
            }
        }

        return res;
    }
}
