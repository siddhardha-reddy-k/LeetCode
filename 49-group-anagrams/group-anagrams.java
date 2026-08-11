import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int[] charFreq = new int[26];

            for(char c : str.toCharArray()) {
                charFreq[ c - 'a']++;
            }
            String charFreqString = Arrays.toString(charFreq);
            map.computeIfAbsent(charFreqString, k -> new ArrayList<>()).add(str);

        }
        
        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}