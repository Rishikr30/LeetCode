class Solution {
    private boolean isValidDistributionCheck(int n, int mid, int[] quantities) {
        int shopsNeeded = 0;
        
        for (int q : quantities) {
            shopsNeeded += (q + mid - 1) / mid;
            
            if (shopsNeeded > n) {
                return false;
            }
        }
        
        return true;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;
        for (int q : quantities) {
            if (q > high) {
                high = q;
            }
        }

        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValidDistributionCheck(n, mid, quantities)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
