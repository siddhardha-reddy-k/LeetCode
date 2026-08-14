class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] stringChar = s.toCharArray();
        while(left<right){
            char leftChar = stringChar[left];
            char rightChar = stringChar[right];
            if(!(Character.isLetter(leftChar))) {
                left++;
                continue;
            } else if(!(Character.isLetter(rightChar))) {
                right--;
                continue;
            }
            
            char temp = leftChar;
            stringChar[left] = stringChar[right];
            stringChar[right] = temp; 
            left++;
            right--;
        }
        return String.valueOf(stringChar);

        
    }
}