class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero_count=0;
        int i =0;
        int j=0;
        int maxLen = 0;
       while(j<nums.length){
            if(nums[j]==0)
            zero_count++;
            if(zero_count>k){
                  if(nums[i]==0)
                  zero_count--;
                   i++;
       }
       if(zero_count<=k){
        int len = j-i+1;
        maxLen = Math.max(maxLen, len);
       }
       j++;
    
       }
        return maxLen;
    }
}