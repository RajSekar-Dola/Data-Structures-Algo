class Solution {
    public static void DFS(int[][] graph, List<List<Integer>> res, ArrayList<Integer> temp, int s, int d) {
        temp.add(s);

        if (s == d) {
            res.add(new ArrayList<>(temp));
        }

        for (int x = 0; x < graph[s].length; x++) {
            DFS(graph, res, temp, graph[s][x], d);
        }

        temp.remove(temp.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        DFS(graph, res, temp, 0, graph.length - 1);
        return res;
    }
}
