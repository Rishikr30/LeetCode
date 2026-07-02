import java.util.*;

class Solution { 
    static String frequencySort(String s) { 
        int n = s.length(); 
        
        int[] fre = new int[128]; 
        for (int i = 0; i < n; i++) { 
            fre[s.charAt(i)]++; 
        } 
        
        List<int[]> vec = new ArrayList<>(); 
        for (int i = 0; i < 128; i++) { 
            if (fre[i] > 0) { 
                vec.add(new int[]{fre[i], i}); 
            } 
        } 
        
        Collections.sort(vec, (a, b) -> b[0] - a[0]); 
        
        StringBuilder ans = new StringBuilder(); 
        for (int[] pair : vec) { 
            for (int i = 0; i < pair[0]; i++) { 
                ans.append((char) pair[1]);
            } 
        } 
        return ans.toString(); 
    } 
}
