class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        int i =0;
        while(i<n){
        char curr = chars[i];
        int count = 0;
        while(i<n && chars[i]==curr){
            count++; i++;
        } 
        sb.append(curr);
            if (count > 1) {
                sb.append(count);
            }
        }
        String compressed = sb.toString();
        for (int j = 0; j < compressed.length(); j++) {
            chars[j] = compressed.charAt(j);
        }

        return compressed.length();
    }
}