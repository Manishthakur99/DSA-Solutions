//https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i=0; i<nums.length; i++){
            //xor kardiya repeating element neglect ho gye and left hi missing hai
            missing ^= i^nums[i];
        }
        return missing;
    }
}
