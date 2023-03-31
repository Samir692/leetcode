class NumberOfIslands {
    public int numIslands(char[][] grid) {

        if(grid.length() == 0){
            return 0;
        }

        int rows = grid.length(), cols = grid[0].length();

        Set<Integer> visit = new HashSet<>();

        int islands = 0;

        for (int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if (grid[r][c] == "1" and !visit.contains(r,c)){
                    bfs(r, c);
                    islands += 1;
                }
            }
        }
        
    }

    void bfs(int r, int c, Set<Integer> visit){
        Queue<Integer> queue = new PriorityQueue<>();
        




    }
}
