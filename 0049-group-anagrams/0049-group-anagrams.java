class Solution {
   public List<List<String>> groupAnagrams(String[] arr) {
       List<List<String>> ans = new ArrayList<>();
       int n = arr.length;


       HashMap<String, List<String>> map = new HashMap<>();
       for (int i = 0; i < n; i++) {
           String str = arr[i];
           char[] chars = arr[i].toCharArray();
           Arrays.sort(chars);
           String sortedStr = new String(chars);
           if (!map.containsKey(sortedStr))
           {
            map.put(sortedStr, new ArrayList<>());
           }
           map.get(sortedStr).add(str);
       }
       for (List<String> group : map.values()) {
           ans.add(group);
       }
       return ans;
   }
}

