class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {    
        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s);
            // res.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
         return new ArrayList<>(res.values());
    }
       
    }
