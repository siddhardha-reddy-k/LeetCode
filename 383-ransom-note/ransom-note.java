import java.util.List;
import java.util.ArrayList;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }        
          List<Character> magazineList = new ArrayList<>();
            
          for(char c : magazine.toCharArray()){
            magazineList.add(c);
          }
          for(char c : ransomNote.toCharArray()){
            if(magazineList.contains(c)) {
                magazineList.remove(Character.valueOf(c));
            } else {
                return false;
            }
          }
          return true;
    }
}