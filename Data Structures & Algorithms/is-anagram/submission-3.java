class Solution {
    public boolean isAnagram(String s, String t) {
      // Solution  1 using Arrays sorting 
       char[] sChars = s.toCharArray();
       char[] tChars = t.toCharArray();
       Arrays.sort(sChars);
       Arrays.sort(tChars);
       return Arrays.equals(sChars, tChars);
       
        // Solution 2  HashMap 
        // HashMap<Character, Integer> sMap = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // HashMap<Character, Integer> tMap = new HashMap<>();
        // for (int i = 0; i < t.length(); i++) {
        //     tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // if (sMap.equals(tMap)) {
        //     return true;
        // }
        // return false;
    }
}
