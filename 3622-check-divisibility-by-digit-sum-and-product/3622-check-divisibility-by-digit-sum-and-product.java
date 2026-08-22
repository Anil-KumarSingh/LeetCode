class Solution {
    public boolean checkDivisibility(int n) {
        int orig = n;
        int sum = 0;
        int temp = n;
        while(temp!=0){ 
           sum  = sum+(temp%10);
           temp = temp/10;
        }
        int prod = 1;
        temp = n;  
        while(temp!=0){
           prod = prod*(temp%10);
           temp=temp/10;
        }
        int ans = sum+prod;
        return orig%ans==0;
            
    }
}