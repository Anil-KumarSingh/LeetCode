class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return isSafe(grid,0, 0, 0 );
    }

    public boolean isSafe(int[][] grid, int row, int col, int num){
       int n = grid.length;
       //base base
       if(grid[row][col]==n*n-1)  return true;
       //check for 2 up and 1 right
       int i,  j;
        i = row-2;
        j = col+1;
       if(i>=0 && j<n && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

       //check for 2 up and 1 left
        i = row-2;
        j = col-1;
       if(i>=0 && j>=0 && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

        //check for 2 down and 1 right
        i = row+2;
        j = col+1;
       if(i<n && j<n && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

        //check for 2 down and 1 left
        i = row+2;
        j = col-1;
       if(i<n && j>=0 && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

       //check 2 right and 1 up
        i = row-1;
        j = col+2;
       if(i>=0 && j<n && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

        //check 2 right and 1 down
        i = row+1;
        j = col+2;
       if(i<n && j<n && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

        //check 2 left and 1 up
        i = row-1;
        j = col-2;
       if(i>=0 && j>=0 && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);
         
        //check 2 left and 1 down
        i = row+1;
        j = col-2;
       if(i<n && j>=0 && grid[i][j]==num+1) return isSafe(grid,i,j,num+1);

       return false;
    }
}