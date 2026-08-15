class Solution {
    public String finalString(String s) {
        if(s.length() == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder(s.length());
        for(char c : s.toCharArray()){
            if(c == 'i'){
                result.reverse();
            } else {
                result.append(String.valueOf(c));
            }

        }
        return result.toString();
    }
}