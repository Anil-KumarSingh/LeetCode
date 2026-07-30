class Solution {
    public String smallestPalindrome(String s) {
    int n = s.length();
    String first = s.substring(0,n/2);
    char[] sort = first.toCharArray();
    Arrays.sort(sort);
    String left = new String(sort);
    //if n is odd
    String middle = (n % 2 == 1) ? "" + s.charAt(n / 2) : "";
    //reverse left as it is pallindrome and convert to string
    String right = new StringBuilder(left).reverse().toString();
    return left+middle+right;
    }
}