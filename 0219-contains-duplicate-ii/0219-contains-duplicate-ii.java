class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //create a HastSet for storing all values
        Set<Integer> set=new HashSet<>();
        // use the for loop to iterate all the element
        for(int i=0;i<=nums.length-1;i++){
            // first check if element present in the hashset return true
            if(set.contains(nums[i])) return true;
            //add the element in the set
            set.add(nums[i]);
            // check if set size is greater the k value so remove the element from the set
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}