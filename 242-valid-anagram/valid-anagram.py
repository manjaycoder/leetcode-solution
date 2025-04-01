class Solution:
    def isAnagram(self, s: str, t: str) -> bool:    
        e= sorted(t)
        f=sorted(s)
        return True if e==f else False
            
        