class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele:nums){
            if(ele<min)
            min = ele;
            if(ele>max)
            max = ele;
        }
        return gcd(min,max);
    }
    private int gcd(int a, int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}