class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxSum=0;
       
       for(int i=0; i<k; i++){
        maxSum=maxSum+nums[i];
       }
       double winSum = maxSum;
       for(int i = k; i<nums.length; i++){
        winSum += nums[i]-nums[i-k];
        maxSum = Math.max(maxSum,winSum);
       }
        return maxSum/k;
    }
}