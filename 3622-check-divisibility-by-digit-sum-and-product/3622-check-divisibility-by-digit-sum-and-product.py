class Solution:
    def checkDivisibility(self, n: int) -> bool:
        orig = n
        sum = 0
        temp = n
        prod = 1
        while(temp!=0):
           last_digit = temp%10  
           sum  = sum+last_digit
           prod = prod*last_digit
           temp = temp//10  
        ans = sum+prod
        if ans == 0:
            return false
        return orig%ans==0
            