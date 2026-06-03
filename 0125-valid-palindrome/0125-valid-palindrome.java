class Solution {
    public boolean isPalindrome(String s) {
        String S = s.replaceAll( "[^a-zA-Z0-9]", "").toLowerCase();

         int i=0, j=S.length()-1;
         while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                return false;
            }
            i++;
            j--;
         }
         return true;
    }
}