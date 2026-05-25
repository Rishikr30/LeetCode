class Solution {
    public int minimumSwaps(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        
        while (i < j) {
            while (i < j && nums[i] != 0) i++;
            while (i < j && nums[j] == 0) j--;
            
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}
