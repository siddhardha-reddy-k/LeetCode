class Solution {
    public int firstUniqChar(String s) {

        outerLoop:
        for(int i = 0; i<s.length(); i++){
            
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && i != j){
                    continue outerLoop;
                }
            }
            return i;
        }
        return -1;
        
    }
}