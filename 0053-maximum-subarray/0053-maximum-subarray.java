class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int ngNum = nums[0];
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<0)
                count++;
                ngNum = Math.max(ngNum,nums[i]);

            currSum += nums[i];
            if(currSum < 0)
                currSum = 0;
            maxSum = Math.max(currSum, maxSum);
        }
        if(count == nums.length){
            return ngNum;
        }else{
            return maxSum;
        }
    }
}