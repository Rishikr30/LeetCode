class Solution {
    private long calculateTotalH(int[] piles, int speed){
        long totalH = 0; 
        for(int bananas : piles) {
            totalH += (bananas + speed - 1) / speed;
        }
        return totalH;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            if (pile > maxPile) {
                maxPile = pile;
            }
        }
        
        int low = 1, high = maxPile;
        int ans = maxPile;

        while(low <= high){
            int mid = low + (high - low) / 2;

            long totalH = calculateTotalH(piles, mid); 
            if(totalH <= h){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
