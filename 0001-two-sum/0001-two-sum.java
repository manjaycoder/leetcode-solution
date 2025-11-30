class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create a HashMap to store number and their indices
        Map<Integer ,Integer> map=new HashMap<>();
        //Iterate through the array
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            //check if the complement is already in the map
            if(map.containsKey(complement)){
                //if found,return the indices of the complement and the current number
                return new int[]{map.get(complement),i};
            }
                //otherwise, add the current number and its index to the map
        map.put(nums[i],i);
        }
        //Return an empy array if no solution i found (this case won't occur as per problem constraints)
        return new int []{};
    }
}