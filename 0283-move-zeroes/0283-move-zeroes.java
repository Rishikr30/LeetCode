class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // If the current element is non-zero
            if (nums[i] != 0) {

                // Swap the current element with
                // the 0 at index 'count'
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;

                // Move 'count' pointer to 
                // the next position
                count++;
            }
        }
    }
}