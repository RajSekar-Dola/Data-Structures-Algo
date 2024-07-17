class Solution {
    public static void DFS(int[][] stones, int index, boolean[] visited) {
        visited[index] = true;
        for (int i = 0; i < stones.length; i++) {
            int r = stones[index][0];
            int c = stones[index][1];

            if (!visited[i] && (stones[i][0] == r || stones[i][1] == c)) {
                DFS(stones, i, visited);
            }
        }
    }

    public int removeStones(int[][] stones) {
        boolean[] visited = new boolean[stones.length];
        Arrays.fill(visited, false);
        int groups = 0;
        for (int i = 0; i < stones.length; i++) {
            if (visited[i]) {
                continue;
            }
            DFS(stones, i, visited);
            groups++;
        }
        return stones.length - groups;
    }
}
