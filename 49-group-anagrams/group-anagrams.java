import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars); 
            String charString = new String(chars);
            map.computeIfAbsent(charString, k -> new ArrayList<>()).add(str);

        }
        
        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}