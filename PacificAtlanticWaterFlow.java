class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rows = heights.length, cols = heights[0].length;

        boolean[][] atlantic = new boolean[rows][cols];
        boolean[][] pacific = new boolean[rows][cols];

        for(int i = 0; i < cols; i++){
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, rows-1, i, Integer.MIN_VALUE, atlantic);
        }

        for(int i = 0; i < rows; i++){
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, cols-1, Integer.MIN_VALUE, atlantic);
        }
        
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(atlantic[i][j]  && pacific[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }

    private void dfs(int[][] heights, int i, int j,  int prevHeight, boolean[][] ocean){
        if(i < 0 || j < 0 || i >= ocean.length || j >= ocean[0].length) return;
        if(heights[i][j] < prevHeight || ocean[i][j]) return;

        ocean[i][j] = true;
        dfs(heights, i+1, j, heights[i][j], ocean);
        dfs(heights, i-1, j, heights[i][j], ocean);
        dfs(heights, i, j+1, heights[i][j], ocean);
        dfs(heights, i, j-1, heights[i][j], ocean);

    }
}
