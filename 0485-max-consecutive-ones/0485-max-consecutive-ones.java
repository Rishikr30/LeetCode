class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, count=0;
        for(int i=0; i<nums.length; i++){
            count++;
            if(nums[i]!=1)
                count = 0;

            if(count > max)
                max = count;
        }
        return max;
    }
}