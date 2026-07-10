class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> hs = new HashSet<>();
      for(int ele: nums)
      hs.add(ele);
      int Max_Streak=0;
      for(int el:hs){
        if(!hs.contains(el-1)){
        int currNum = el;
        int currStreak= 1;
        
      while(hs.contains(currNum+1)){
          currStreak++;
          currNum++;
        }
      Max_Streak = Math.max(currStreak,Max_Streak);
         }
      }
    return Max_Streak;
}
}
