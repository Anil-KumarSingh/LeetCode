class Solution {
    static Integer[] dp;
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new Integer[n];
        int ans = solve(stoneValue,0);
        if(ans>0) return "Alice";
        if(ans<0) return "Bob";
         return "Tie";
    }
    public int solve(int[] stoneValue, int i){
        //base case
        if(i==stoneValue.length) return 0;
        if (dp[i] != null) return dp[i];
        int best_score = Integer.MIN_VALUE;
        int sum = 0;
        for(int k = 1; k<=3; k++){
          if (i + k > stoneValue.length)
          break;
          sum += stoneValue[i + k - 1];
          best_score = Math.max(best_score, sum - solve(stoneValue,i+k));
    }
    return dp[i]=best_score;
    }
}