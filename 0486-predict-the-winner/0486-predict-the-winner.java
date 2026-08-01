class Solution {
    public boolean predictTheWinner(int[] nums) {
      return helper(nums,0, nums.length-1)>=0;
    }
    public int helper(int[] nums, int i, int j){
        if(i==j) return nums[i];
        //choose left
        int pick_L = nums[i]-helper(nums,i+1,j);
         //choose right
        int pick_R = nums[j]-helper(nums,i,j-1);
        return Math.max(pick_L,pick_R);
    }
}