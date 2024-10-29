class Solution {
    public int[] searchRange(int[] nums, int target) {
           int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    static int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == start || nums[mid - 1] != target) {
                        return mid; // Found first occurrence
                    }
                    end = mid - 1; // Search left
                } else {
                    if (mid == end || nums[mid + 1] != target) {
                        return mid; // Found last occurrence
                    }
                    start = mid + 1; // Search right
                }
            } else if (nums[mid] > target) {
                end = mid - 1; // Target is on the left side
            } else {
                start = mid + 1; // Target is on the right side
            }
        }
        return -1; // Target not found
    }
}