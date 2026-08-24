class Solution {
    public int romanToInt(String s) {
        /* IV - IIII 
        IX - VIIII 
        XL - XXXX
        XC - LXXXX
        CD - CCCC
        CM - DCCCC
        */
        
        s = s.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");
        int total = 0;
        for(char c : s.toCharArray()){
            switch(c) {
                case 'M': 
                total+= 1000;
                break;
                case 'D': 
                total+= 500;
                break;
                case 'C': 
                total+= 100;
                break;
                case 'L': 
                total+= 50;
                break;
                case 'X': 
                total+= 10;
                break;
                case 'V': 
                total+= 5;
                break;
                case 'I': 
                total+= 1;
                break;
            }
        }
        return total;
    }
}