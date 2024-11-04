                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> modCount = new HashMap<>();
        modCount.put(0, 1);
     for (int num : nums) {
            sum += num; 
            int mod = ((sum % k) + k) % k;
    ans += modCount.getOrDefault(mod, 0);
       modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
        }
        
        return ans;



    }
}