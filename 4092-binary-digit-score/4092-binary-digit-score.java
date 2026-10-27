class Solution {
    public int calculateScore(int a, int b) {
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        int count = 0; int count1 = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)=='1'){
                count++;
            }
        }
            for(int j = 0; j<s2.length(); j++){
            if(s2.charAt(j)=='1'){
                count1++;
            }
        }
        if(count>count1 || count==count1){
            return count*count1;
        } else{
            if(count==0) return 0;
            return count1/count;
        }
    }
}