class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0;
        int rs = Arrays.stream(nums).sum();
        int[] B = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            rs = rs - nums[i];
            B[i] = Math.abs(ls-rs);
            ls = ls + nums[i];
        }
        return B;
    }
}