class Solution {
    public String reverseByType(String s) {
        if (s.length() == 1) {
            return s;
        }
        int left = 0;
        int right = s.length() -1;

        char[] stringChar = s.toCharArray();
        while(left < right){
            if(!(Character.isLetter(stringChar[left]))) {
                left++;
                continue;
            } else if (!(Character.isLetter(stringChar[right]))){
                right--;
                continue;
            }
            char temp = stringChar[left];
            stringChar[left] = stringChar[right];
            stringChar[right] = temp;
            left++;
            right--;
        }

        left = 0;
        right = s.length() -1;
        while(left < right){
            if((Character.isLetter(stringChar[left]))) {
                left++;
                continue;
            } else if ((Character.isLetter(stringChar[right]))){
                right--;
                continue;
            }
            char temp = stringChar[left];
            stringChar[left] = stringChar[right];
            stringChar[right] = temp;
            left++;
            right--;
        }
    return String.valueOf(stringChar);

    }
}