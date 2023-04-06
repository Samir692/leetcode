class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int ROWS = matrix.length, COLS = matrix[0].length;
        int top = 0, bottom = ROWS-1, row = 0;

        while(top <= bottom){
            row = (top+bottom) / 2;
            if(target > matrix[row][COLS-1]){
                top = row + 1; 
            }
            else if(target < matrix[row][0]){
                bottom = row-1;
            }
            else {
                break;
            }
        }

        if(top > bottom){
            return false;
        }

        int left=0, right=COLS-1;
        row = (top+bottom)/2;
        int mid = 0;

        while(left <= right){
            mid = (left+right)/2;

            if(target > matrix[row][mid]){
                left = mid+1;
            }
            else if(target < matrix[row][mid]){
                right = mid-1;
            }
            else{
                return true;
            }
        }
        return false;        
    }
}
