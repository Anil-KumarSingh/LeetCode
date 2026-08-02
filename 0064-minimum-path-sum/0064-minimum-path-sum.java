class Solution {
    static int[][] dp;
    public int minPathSum(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;
        dp = new int[a][b];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return pathSum(grid,a-1,b-1);
    }
    public int pathSum(int[][] grid, int m, int n){
        //base case
         if(m==0 && n==0) return grid[0][0];
        if(m<0 || n<0)
        return Integer.MAX_VALUE;
        if(dp[m][n]!=-1) return dp[m][n];
        int left = pathSum(grid,m-1, n);
        int up = pathSum(grid,m,n-1);
        return dp[m][n]=grid[m][n]+Math.min(left,up);
    }
}