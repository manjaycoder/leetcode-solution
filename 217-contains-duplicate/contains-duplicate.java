class Solution {
    public boolean containsDuplicate(int[] nums) {
       
       Set<Integer> two =new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (two.contains(nums[i])) {
                return true;
            } else {
                two.add(nums[i]);
            }

        }
        return false;

  
    }
}