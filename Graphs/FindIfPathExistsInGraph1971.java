class Solution {
  //using BFS
    public static boolean BFS(HashMap<Integer, HashSet<Integer>> hm, int s, int d, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == d) {
                return true;
            }
            for (int x : hm.get(node)) {
                if (!visited[x]) {
                    q.add(x);
                    visited[x] = true;
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < edges.length; i++) {
            HashSet<Integer> temp1 = hm.getOrDefault(edges[i][0], new HashSet<>());
            temp1.add(edges[i][1]);
            hm.put(edges[i][0], temp1);

            HashSet<Integer> temp2 = hm.getOrDefault(edges[i][1], new HashSet<>());
            temp2.add(edges[i][0]);
            hm.put(edges[i][1], temp2);
        }

        return BFS(hm, source, destination, visited);
    }
}

class Solution {
  //USING DFS
    public static boolean DFS(HashMap<Integer, HashSet<Integer>> hm, int s, int d, boolean[] visited) {
        if (s == d) {
            return true;
        }

        if (visited[s]) {
            return false;
        }

        visited[s] = true;
        for (int i : hm.get(s)) {
            if (DFS(hm, i, d, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < edges.length; i++) {
            HashSet<Integer> temp1 = hm.getOrDefault(edges[i][0], new HashSet<>());
            temp1.add(edges[i][1]);
            hm.put(edges[i][0], temp1);

            HashSet<Integer> temp2 = hm.getOrDefault(edges[i][1], new HashSet<>());
            temp2.add(edges[i][0]);
            hm.put(edges[i][1], temp2);
        }

        return DFS(hm, source, destination, visited);
    }
}
