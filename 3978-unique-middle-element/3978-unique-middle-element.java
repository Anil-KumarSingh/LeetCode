class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if (nums.length == 0) return false;

        // Find middle element
        int middleIndex = nums.length / 2;
        int middle = nums[middleIndex];

        // Count frequency of middle element
        int count = 0;
        for (int ele : nums) {
            if (ele == middle) {
                count++;
            }
        }

        // Unique if frequency == 1
        return count == 1;
    }
}
