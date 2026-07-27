class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            ans.add(ele);
        }
            int top1 = ans.poll();
            int top2 = ans.poll();
        return (top1-1)*(top2-1);
    }
}