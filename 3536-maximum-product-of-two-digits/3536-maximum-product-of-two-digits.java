class Solution {
    public int maxProduct(int n) {
         // Convert integer to string, then to char array
        char[] dig = String.valueOf(n).toCharArray();
        // Sort digits
        Arrays.sort(dig);
          // Get last digit
        int lDigit = dig[dig.length-1]-'0';   
        // Get second last digit
        int secLDigit = dig[dig.length-2]-'0';
        int prod = lDigit * secLDigit;
        return prod;
    }
}