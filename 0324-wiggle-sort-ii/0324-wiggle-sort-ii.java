class Solution {
    public void wiggleSort(int[] nums) {
        // creating temporary array 
        int n = nums.length;
        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[i] = nums[i];
        }
        //sort temp array
        Arrays.sort(temp);
        //divide and point to last element of smaller and larger array
        int left = (n-1)/2;
        int right = n-1;
        for(int i =0; i<n; i+=2){
            nums[i]=temp[left];
            left--;
        }
        for(int i = 1; i<n; i+=2){
            nums[i] = temp[right];
            right--;
        }
    }
}