class Solution {
    public int maxArea(int[] height) {
      int left=0;
       int max=0;
       int right=height.length-1;

       while(left<right){
          int width=right-left;
          int area=Math.min(height[left],height[right])*width;
          max=Math.max(max,area);
          if(height[right]>=height[left]){
              left++;
          }else{
              right--;
          }
       }
       return max;
    }
}