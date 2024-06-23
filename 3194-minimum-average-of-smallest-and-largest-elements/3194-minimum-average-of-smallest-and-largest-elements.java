class Solution {
    public double minimumAverage(int[] nums) {
         List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        double[] avg = new double[nums.length/2];
        for(int i = 0; i < nums.length/2; i++){
        int max = Collections.max(list);
        list.remove(Integer.valueOf(max));
        int min = Collections.min(list);
        list.remove(Integer.valueOf(min));
        double average = (max+min)/2.0;
        avg[i] = average;
        }
        double minAverage = Double.MAX_VALUE;
        for (double a : avg) {
            if (a < minAverage) {
                minAverage = a;
            }
        }
        return minAverage;
    }
}