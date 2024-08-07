class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double div = 0;
        double max = Integer.MIN_VALUE;
        while(j < nums.length){
            sum = sum + nums[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                div = sum / k;
                max = Math.max(div,max);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}