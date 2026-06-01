class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        if (nums[0] > target) {
            return idx;
        }
        if (nums[nums.length - 1] < target) {
            idx = nums.length;
            return idx;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                idx = i;

            }
            if (nums[i] < target && nums[i + 1] > target) {
                idx = i + 1;
            }
        }
        return idx;
    }
}