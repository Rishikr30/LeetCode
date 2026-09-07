class Solution {
    public int sumOfGoodIntegers(int n, int k) {
         int lowerBound = Math.max(1, n - k);
        int upperBound = n + k;
        int totalSum = 0;

        
        for (int x = lowerBound; x <= upperBound; x++) {
          
            if ((n & x) == 0) {
                totalSum += x;
            }
        }

        return totalSum;
    }
}
