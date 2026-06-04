class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1] && arr[i] > arr[i+1]){
                peak = i;
            }
        }
        return peak;
    }
}