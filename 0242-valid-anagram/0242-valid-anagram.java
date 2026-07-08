class Solution {
    public HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character ch =  str.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        return mp;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }
        
}