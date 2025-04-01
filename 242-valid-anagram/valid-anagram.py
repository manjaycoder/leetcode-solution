class Solution:
    def isAnagram(self, s: str, t: str) -> bool:    
        nums=defaultdict(int)
        for x in t:
            nums[x] +=1
        for x in s:
            nums[x] -=1
        for val in nums.values():
            if val !=0:
                return False

        return True
            
        