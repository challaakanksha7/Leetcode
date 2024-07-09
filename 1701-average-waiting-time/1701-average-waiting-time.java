class Solution {
    public double averageWaitingTime(int[][] customers) {
        double val = 0;
        double sum_time = customers[0][0];
        for (int i = 0; i < customers.length; i++) {
            if (customers[i][0] <= sum_time) {
                sum_time = sum_time + customers[i][1];
                val = val + sum_time - customers[i][0];
                System.out.println(val);
            } else {
                sum_time = customers[i][0];
                sum_time += customers[i][1];
                val = val + customers[i][1];
                System.out.println(val);
            }

        }
        System.out.println(val);
        double avg = val / customers.length;
        System.out.println(avg);
        return avg;
    }
}