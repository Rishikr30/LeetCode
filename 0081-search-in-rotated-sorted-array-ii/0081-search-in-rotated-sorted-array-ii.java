class Solution {
    public boolean search(int[] nums, int target) {
        boolean num = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]== target){
                num = true;
            }
        }
        return num;
    }
}