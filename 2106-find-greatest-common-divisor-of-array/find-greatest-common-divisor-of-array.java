import java.util.Arrays;
class Solution {
    public static int findGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }

        if (n1 == 0) {
            return n2;
        }

        return n1;
    } 


    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return findGCD(nums[0], nums[nums.length-1]);

    }
}