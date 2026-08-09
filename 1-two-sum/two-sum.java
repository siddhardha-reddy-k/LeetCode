import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexPairs = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int secondNum = target - nums[i];

            if(numIndexPairs.containsKey(secondNum)) {
                return new int[] {numIndexPairs.get(secondNum), i};
            }

            numIndexPairs.put(nums[i], i);
        }
        return new int[] {};
    }
}