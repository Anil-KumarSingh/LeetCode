// class Solution {
//     public int countKDifference(int[] nums, int k) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (Math.abs(nums[i] - nums[j]) == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count += freq.getOrDefault(num - k, 0);
            count += freq.getOrDefault(num + k, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
