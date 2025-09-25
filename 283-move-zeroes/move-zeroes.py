class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        count = 0  # position to place the next non-zero element

        # move all non-zero elements forward
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[count] = nums[i]
                count += 1

        # fill the rest with zeros
        while count < len(nums):
            nums[count] = 0
            count += 1
