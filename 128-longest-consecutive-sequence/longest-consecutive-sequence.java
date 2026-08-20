import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = HashSet.newHashSet(nums.length); 
        Arrays.stream(nums).forEach(set::add);
        int maxSeq = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int seqLength = 1;
                
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    seqLength++;
                }
                
                maxSeq = Math.max(maxSeq, seqLength);

            }
        }
        return maxSeq;

    }
}