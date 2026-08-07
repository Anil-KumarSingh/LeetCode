class Solution {
    public void moveZeroes(int[] nums) {
       Stack<Integer> st = new Stack<>();
       Queue<Integer> q = new LinkedList<>();
       for(int i = 0; i<nums.length; i++){
        if(nums[i]==0)
        st.push(nums[i]);
        else
        q.add(nums[i]);
       }
           int index = 0;
        while (!q.isEmpty()) {
            nums[index++] = q.poll();
        }
        while (!st.isEmpty()) {
            nums[index++] = st.pop();
    }
}
}