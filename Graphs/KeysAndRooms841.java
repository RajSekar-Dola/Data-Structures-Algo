public static void DFS(List<List<Integer>> rooms,int i,boolean [] visited){
        if(visited[i]){
            return;
        }

        visited[i] = true;
        for(int x=0;x<rooms.get(i).size();x++){
            if(!visited[rooms.get(i).get(x)]){
                DFS(rooms,rooms.get(i).get(x),visited);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Arrays.fill(visited, false);

        DFS(rooms, 0, visited);

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }
