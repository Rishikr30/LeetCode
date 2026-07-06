class Solution {
    public int maxDepth(String s) {
         int p = 0; 
        int ans = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == '(') p++;
            else if (ch == ')') p--;
            ans = Math.max(ans, p);
        }
        return ans; 
    }
}