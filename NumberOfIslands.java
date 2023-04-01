class NumberOfIslands {
    public int numIslands(char[][] grid) {

        if(grid.length == 0){
            return 0;
        }

        int rows = grid.length, cols = grid[0].length;
        int islands = 0;

        for (int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if (grid[r][c] == '1'){
                    bfs(grid, r, c);
                    islands += 1;
                }
            }
        }
        return islands;
        
    }

    void bfs(char[][] grid, int i, int j){
        if(
            i < 0 ||
            j < 0 ||
            i >= grid.length ||
            j >= grid[0].length ||
            grid[i][j] == '0'
        ){
            return;
        }
        grid[i][j] = '0';
        bfs(grid, i+1, j);
        bfs(grid, i, j+1);
        bfs(grid, i-1, j);
        bfs(grid, i, j-1);   
    }
}
