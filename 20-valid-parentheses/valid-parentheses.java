import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if( c == '(') {
                deque.push(')');
            } else if ( c == '[') {
                deque.push(']');
            } else if ( c == '{') {
                deque.push('}');
            } else if (deque.isEmpty() || deque.pop() != c) {
                return false;
            }
        }

        return deque.isEmpty();
    }
}