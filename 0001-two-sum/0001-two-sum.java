class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> Map=new HashMap<>();
        //Iterate through the array
        for(int i=0;i<nums.length;i++){
            //Calculate the complement of the current number
            int element=target-nums[i];
            //Check if the complement is already in the map
              if(Map.containsKey(element)){
                  //if found, return the indices of the complement and the current number
                  return new int[] {Map.get(element),i};
              }
              //Otherwise, add the current number and its index to the map
              Map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
