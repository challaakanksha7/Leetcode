class Solution {
    public int hammingDistance(int x, int y) {
        int c = x ^ y;
        int count = Integer.bitCount(c);
        return count;
    }
}