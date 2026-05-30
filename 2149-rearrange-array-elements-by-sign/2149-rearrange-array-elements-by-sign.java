class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] rearrangedNums = new int[nums.length];
        int pos =0;
        int neg = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                rearrangedNums[pos] = nums[i];
                pos = pos+2;
            }else{
                rearrangedNums[neg] = nums[i];
                neg = neg+2;
            }
        }
        return rearrangedNums;
    }
}