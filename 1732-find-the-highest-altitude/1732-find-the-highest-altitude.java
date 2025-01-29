class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int alt = 0;
        for(int num : gain){
            alt = alt + num;
            max = Math.max(alt, max);
        }
        return max;
    }
}