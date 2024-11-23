class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()  # Sort the input list
        res = []  # This will store the result
        length = len(nums)
        
        for i in range(length - 2):  # Loop through the list, ensuring there's room for two other elements
            # Skip duplicate elements to avoid counting the same triplet again
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            l, r = i + 1, length - 1  # Left and right pointers
            
            while l < r:
                total = nums[i] + nums[l] + nums[r]  # Sum of the current triplet
                
                if total < 0:  # We need a larger sum, move the left pointer to the right
                    l += 1
                elif total > 0:  # We need a smaller sum, move the right pointer to the left
                    r -= 1
                else:  # Found a valid triplet
                    res.append([nums[i], nums[l], nums[r]])
                    
                    # Skip duplicates for the left pointer
                    while l < r and nums[l] == nums[l + 1]:
                        l += 1
                    
                  
                    while l < r and nums[r] == nums[r - 1]:
                        r -= 1
                 
                    l += 1
                    r -= 1
        
        return res
