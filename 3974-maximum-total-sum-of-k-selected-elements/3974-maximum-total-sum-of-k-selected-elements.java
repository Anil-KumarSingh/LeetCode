class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums); // ascending
        int n = nums.length;

        long sum = 0;
        // take k largest elements
        for (int i = n - 1; i >= n - k; i--) {
            if (mul > 0) {
                sum += (long) nums[i] * mul;
                mul--; // decrease multiplier after each use
            } else {
                sum += nums[i]; // if mul == 0, just add element itself
            }
        }
        return sum;
    }
}

