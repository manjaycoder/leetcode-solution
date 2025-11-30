class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        // Step 1: Count frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Step 2: Min-heap based on frequency
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> count.get(a) - count.get(b)
        );

        // Step 3: Keep heap size = k (store most frequent k elements)
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Step 4: Build result array
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
