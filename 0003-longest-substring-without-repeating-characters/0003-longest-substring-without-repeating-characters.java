class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        int[] lastIndex = new int[128];
        for(int i=0; i<128; i++){
            lastIndex[i] = -1;
        }

        int start = 0;
        for(int end = 0; end<n; end++){
            start = Math.max(start, lastIndex[s.charAt(end)]+1);
            res = Math.max(res, end-start+1);

            lastIndex[s.charAt(end)] = end;
        }
        return res;

    }
}