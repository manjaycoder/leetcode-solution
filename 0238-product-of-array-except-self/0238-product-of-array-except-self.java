class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Result array to store the final answer
        // Initially everything is 1 because we will multiply values into it
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        // 'pre' will store the prefix product (product of all elements before current index)
        int pre = 1;

        // First pass: fill result[] with prefix products
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;          // result[i] = product of all elements to the LEFT
            pre = pre * nums[i];      // update prefix for next index
        }

        // 'post' will store the suffix product (product of all elements after current index)
        int post = 1;

        // Second pass: multiply each result[i] with suffix product
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * post;  // multiply by product of all elements to the RIGHT
            post = post * nums[i];         // update suffix for next index
        }

        // Now result[i] has: (product of left) * (product of right)
        return result;
    }
}
