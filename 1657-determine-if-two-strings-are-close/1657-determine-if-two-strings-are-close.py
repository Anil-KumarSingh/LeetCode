class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if(len(word1)!=len(word2)):
            return False
        freq1 = {}
        freq2 = {}
        for i in word1:
            freq1[i] = freq1.get(i,0)+1
        for x in word2:
             freq2[x] = freq2.get(x,0)+1
        if set(freq1.keys()) != set(freq2.keys()):
            return False
        if sorted(freq1.values()) != sorted(freq2.values()):
            return False
            
        return True
        