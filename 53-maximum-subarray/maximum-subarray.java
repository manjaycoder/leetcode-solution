class Solution {
    public int maxSubArray(int[] nums) {
          int overAllsum=nums[0];
      int currentSum=0;
        for (int i = 0; i < nums.length; i++) {
             currentSum=Math.max(nums[i],nums[i]+currentSum);
             overAllsum=Math.max(currentSum,overAllsum);

        }
        return overAllsum;
    }
}