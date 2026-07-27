class Solution {
    public boolean canJump(int[] nums) {
       int maxIndex = 0;
       int i = 0;
       while(i<=maxIndex){
        maxIndex = Math.max(maxIndex, i+nums[i]);
        if(maxIndex>=nums.length-1){
        return true;
        }
        i++;
       }
       return false;
    }
}