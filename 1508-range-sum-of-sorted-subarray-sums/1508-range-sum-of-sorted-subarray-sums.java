class Solution {
    private static int mod = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
         int size = n * (n + 1) / 2;
         int k = 0;
         int[] result = new int[size];
         for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = (sum + nums[j]) % mod;
                result[k] = sum;
                k++;
            }
         }
         Arrays.sort(result);
         int s = 0;
         for(int i = left-1; i < right; i++){
            s = s + result[i];
            //System.out.println(s);
         }
         s = s % mod;
         return s;
    }
}