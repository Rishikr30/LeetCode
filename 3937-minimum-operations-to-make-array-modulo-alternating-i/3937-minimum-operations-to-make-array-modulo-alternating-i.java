class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        
        int[] evenFreq = new int[k];
        int[] oddFreq = new int[k];
        int evenCount = 0, oddCount = 0;
        
        for (int i = 0; i < n; i++) {
            int rem = nums[i] % k;
            if (i % 2 == 0) {
                evenFreq[rem]++;
                evenCount++;
            } else {
                oddFreq[rem]++;
                oddCount++;
            }
        }
        
        int minTotalOps = Integer.MAX_VALUE;
        
        
        for (int x = 0; x < k; x++) {
        
            int evenOps = 0;
            for (int rem = 0; rem < k; rem++) {
                if (evenFreq[rem] > 0) {
                    int dist = Math.abs(rem - x);
                    int minStep = Math.min(dist, k - dist);
                    evenOps += minStep * evenFreq[rem];
                }
            }
            
            for (int y = 0; y < k; y++) {
                if (x == y) continue; 
                int oddOps = 0;
                for (int rem = 0; rem < k; rem++) {
                    if (oddFreq[rem] > 0) {
                        int dist = Math.abs(rem - y);
                        int minStep = Math.min(dist, k - dist);
                        oddOps += minStep * oddFreq[rem];
                    }
                }
                
                
                minTotalOps = Math.min(minTotalOps, evenOps + oddOps);
            }
        }
        
        return minTotalOps;
    }
}