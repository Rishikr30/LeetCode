class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, target, 0, curr, result);
        return result;
    }

    private void backtrack(int[] nums, int target, int start, List<Integer> curr, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(curr)); 
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target)
                break; 

            curr.add(nums[i]);
            backtrack(nums, target - nums[i], i, curr, result);
            curr.remove(curr.size() - 1); 
        }
    }
}