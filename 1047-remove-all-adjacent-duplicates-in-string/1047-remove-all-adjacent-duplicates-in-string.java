class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        int k = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char current = str.charAt(i);
            
            if (k > 0 && str.charAt(k - 1) == current) {
                k--; 
            } else {
                str.setCharAt(k++, current);
            }
        }
        
        str.setLength(k); 
        return str.toString();
    }
}
