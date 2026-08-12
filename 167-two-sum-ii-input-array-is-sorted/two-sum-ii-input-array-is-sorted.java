class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //  Number,  index  
        for(int i = 0; i<numbers.length; i++) {
            int secoundNum = numbers[i];
            int firstNum = target - secoundNum;
            // secoundNum + firstNum in map = target
            if(map.containsKey(firstNum)){
                return new int[] {map.get(firstNum) + 1, i + 1};
            }
            map.put(secoundNum, i);
        }
        return new int[] {};
    }
}