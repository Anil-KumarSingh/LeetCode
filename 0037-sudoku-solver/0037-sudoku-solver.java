class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }
        private boolean backtrack(char[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {  //empty cell
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) { //validation check
                            board[i][j] = c;       //placing number
                            if (backtrack(board))  //recurse
                                return true;
                            else
                                board[i][j] = '.';   //backtracking
                        }
                    }
                    return false;   //no valid number found
                }
            }
        }
        return true; //all cell filled
        
    }
    public boolean isValid(char[][] board, int row, int col, char num){
        int n  = board.length;
        //check column
        for(int j=0; j<n; j++){
            if(board[row][j]==num) return false;
        }

        //check row
        for(int i=0; i<n; i++){
            if(board[i][col]==num) return false;
        }

        //check grid 3*3
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i = sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}
