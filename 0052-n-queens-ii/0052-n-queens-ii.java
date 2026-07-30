public class Solution {
    public int totalNQueens(int n) {
      char[][] board = new char[n][n];
      for(char[] res: board){
      Arrays.fill(res,'.');
      }
      List<List<String>> ans = new ArrayList<>();
      backtrack(board, 0, ans);
      return ans.size();
    }

    public void backtrack(char[][] board, int row, List<List<String>> ans ){
        int n = board.length;
        if(row==n){
        ans.add(construct(board));
        return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                backtrack(board,row+1, ans);
                board[row][j]='.';
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

    public List<String> construct(char[][] board){
        List<String> Path = new ArrayList<>();
        for(char[] row:board){
            Path.add(new String(row));
        }
        return Path;
    }
}