class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,i);

        }
        return false;
   }

}