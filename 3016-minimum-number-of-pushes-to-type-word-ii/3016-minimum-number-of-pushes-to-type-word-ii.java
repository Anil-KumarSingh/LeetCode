class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> freq = new HashMap<>();
         for(char str: word.toCharArray()){
            freq.put(str, freq.getOrDefault(str,0)+1);
         }
        List<Integer> values = new ArrayList<>(freq.values());
        values.sort(Collections.reverseOrder());
        int ans = 0;
        int idx = 0;
        for (int val:values){
            ans += val * (idx / 8 + 1);
            idx++;
        }
        return ans;
    }
}