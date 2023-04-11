class WordSearch {
    public boolean exist(char[][] board, String word) {

        int ROWS = board.length, COLS = board[0].length;

        char[] word_c = word.toCharArray();
        for (int r = 0; r <= ROWS; r++){
            for(int c = 0; c <= COLS; c++){
                if(dfs(r, c, 0, word_c, board)){
                    return true;
                }
            }
        }
        return false;        
    }

    boolean dfs(int r, int c, int i, char[] word_c, char[][]board){
        if(i == word_c.length){
            return true;
        }

        if(r < 0 || c < 0 || r >= board.length ||
            c >= board[0].length ||
            word_c[i] != board[r][c] ||
            board[r][c] == '#'){
                return false;
            }

        char temp = board[r][c];
        board[r][c] = '#';

        boolean res = dfs(r+1, c, i+1, word_c, board) ||
                      dfs(r, c+1, i+1, word_c, board) ||
                      dfs(r-1, c, i+1, word_c, board) ||
                      dfs(r, c-1, i+1, word_c, board);
        board[r][c] = temp;
        return res;
    }
}
