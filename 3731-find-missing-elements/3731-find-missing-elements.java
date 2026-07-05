class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<Integer> ans  = new ArrayList<>();
        int maxValue = max(nums);
        int minValue = min(nums);
        Set<Integer> hs = new HashSet<>();
        for(int ele:nums)
        hs.add(ele);
        for (int i = minValue; i <= maxValue; i++) {
            if (!hs.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
    public static int max(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
              }
            }
            return max;
        }

        public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}

    