class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length){
            sum = sum+nums[j];
            while(sum>=target){
                sum = sum-nums[i];
                min = Math.min(min, j-i+1);
                i++;
            }
            j++;
        }

        return min==Integer.MAX_VALUE ? 0 : min;
    }
}