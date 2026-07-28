class Solution {
public:
    string smallestPalindrome(string s) {
        int n=s.size();
    if(s.size()%2!=0){
        sort(s.begin(),s.begin()+n/2);
        sort(s.begin()+n/2+1,s.end(), greater<int>());

    } 
    else{
      sort(s.begin(),s.begin()+n/2);
        sort(s.begin()+n/2,s.end(), greater<int>());   
    }
    return s;
    }
};