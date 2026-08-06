class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int sums: nums){
             sum += sums;
        }
            if(sum%2!=0) return false;
            int target = sum/2;
            Boolean[][] dp = new Boolean[nums.length][target+1];
            return solve(0,0,nums,target,dp);
        }
        private boolean solve(int i, int sum, int[] nums, int target, Boolean[][]dp){
            // base case
            if(i==nums.length){
                if(sum==target) return true;
                else return false;
            }
            if (i >= nums.length || sum > target) return false; //for out of bound
            if(dp[i][sum]!=null) return dp[i][sum];
            boolean skip = solve(i+1, sum, nums, target,dp);
            boolean pick = solve(i+1, sum+nums[i], nums, target,dp);
            return dp[i][sum] = pick||skip;

        }
    }
