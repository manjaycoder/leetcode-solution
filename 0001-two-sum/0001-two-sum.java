class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hashmap 
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        //Iterate through the array
        for(int i=0;i<=nums.length-1;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);

        }
       return new int[]{-1,-1};
        
    }
}