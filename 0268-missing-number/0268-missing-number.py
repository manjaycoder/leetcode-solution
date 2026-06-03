class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        total=n*(n+1)//2
        
        current_sum=0
        for i in range(len(nums)):
            current_sum+=nums[i]
        return total-current_sum

        