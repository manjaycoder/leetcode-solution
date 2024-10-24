class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> sp = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
        if(sp.contains(nums[i])) return true;
            sp.add(nums[i]);
            if(sp.size()>k){
               sp.remove(nums[i-k]);
            }
        }

        return false;  
    }
}