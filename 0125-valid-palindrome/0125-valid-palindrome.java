class Solution {
    public boolean isPalindrome(String s) {
        String S = s.replaceAll( "[^a-zA-Z0-9]", "").toLowerCase();

         for(int i=0; i<S.length(); i++){
            if(S.charAt(i)!=S.charAt(S.length()-1-i)){
                return false;
            }
    
         }
         return true;
    }
}