class Solution {


   private boolean containsPatternInWindow(String text, String pattern, int windowLen, int[] startRef) {
       int[] freq = new int[256];
       int uniqueChars = 0;


       for (char ch : pattern.toCharArray()) {
           if (freq[ch] == 0) uniqueChars++;
           freq[ch]++;
       }


       int matched = 0;


       for (int i = 0; i < text.length(); i++) {
           freq[text.charAt(i)]--;
           if (freq[text.charAt(i)] == 0) matched++;


           if (i >= windowLen) {
               char leftChar = text.charAt(i - windowLen);
               freq[leftChar]++;
               if (freq[leftChar] == 1) matched--;
           }


           if (i >= windowLen - 1 && matched == uniqueChars) {
               startRef[0] = i - windowLen + 1;
               return true;
           }
       }


       return false;
   }


   public String minWindow(String s, String t) {
       int sLen = s.length();
       int tLen = t.length();


       if (sLen < tLen) return "";


       int left = tLen, right = sLen;
       int minWindowLength = Integer.MAX_VALUE;
       int windowStartIndex = -1;


       while (left <= right) {
           int mid = (left + right) / 2;
           int[] currentStart = new int[1];


           if (containsPatternInWindow(s, t, mid, currentStart)) {
               if (mid < minWindowLength) {
                   minWindowLength = mid;
                   windowStartIndex = currentStart[0];
               }
               right = mid - 1;
           } else {
               left = mid + 1;
           }
       }


       return windowStartIndex == -1 ? "" : s.substring(windowStartIndex, windowStartIndex + minWindowLength);
   }
}


