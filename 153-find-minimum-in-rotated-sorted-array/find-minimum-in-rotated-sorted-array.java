class Solution {
    public int findMin(int[] nums) {
        int Left=0;

      int right=nums.length-1;
      int ans=nums[0];
      if(nums.length==1){
          return nums[0];
      }
      while(Left<=right){
          if(nums[Left]<nums[right]){
              ans=Math.min(ans,nums[Left]); 
          }
          int mid=(Left+right)/2;
          ans=Math.min(ans,nums[mid]);
          if(nums[Left]<=nums[mid]){
              Left=mid+1;
          }else{
              right=mid-1;
          }

      }
      return ans;
    }
}