import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(canBeTyped(word)){
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    boolean canBeTyped(String word){
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM";
        boolean[] status = new boolean[3];
        for(char c : word.toCharArray()){
            if(firstRow.indexOf(c) == -1) {
                status[0] = false;
                break;
            }
            status[0] = true;
        }
        for(char c : word.toCharArray()){
            if(secondRow.indexOf(c) == -1) {
                status[1] = false;
                break;
            }
            status[1] = true;
        }
        for(char c : word.toCharArray()){
            if(thirdRow.indexOf(c) == -1) {
                status[2] = false;
                break;
            }
            status[2] = true;
        }
        for(boolean b : status){
            if(b == true){
                return true;
            }
        }
        return false;
    }
}