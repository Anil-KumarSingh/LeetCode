class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
         char [][] board = new char[n][n];
        // Fill board with '.'
        for (char[] row : board){
            Arrays.fill(row, '.');
        }
        backtrack(board, 0, res);
        return res;
    }

    private void backtrack(char[][] board, int row, List<List<String>> res){
        int n = board.length;
        if(row==n){               //base case
           res.add(construct(board));
           return;
        }
      
    for(int j=0; j<n; j++){
        if(isSafe(board,row,j)){
            board[row][j]='Q';
            backtrack(board, row+1, res);
            board[row][j] = '.';  //backtrack
        }
    }
        
    }
    private  boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        //check row-> East and West
        for(int j = 0; j<n; j++){
            if(board[row][j]=='Q') return false;
        }

        //check col
        for(int i = 0; i<n; i++){
            if(board[i][col]=='Q') return false;
        }

        //check diagonal between row and col -> East and North
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--; j++;
        }

        //check diagonal between row and col -> East and South
         i = row;
         j = col;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++; j++;
        }

        //check diagonal between row and col -> south and west
         i = row;
         j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++; j--;
        }

        //check diagonal between row and col -> Wet and North
         i = row;
         j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--; j--;
        }
        return true;
    }
   private  List<String> construct(char[][] board) {  //function to convert into list of string
        List<String> path = new ArrayList<>();
        for (char[] row : board) {
            path.add(new String(row));
        }
        return path;
    }
  }