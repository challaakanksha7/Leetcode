class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        while(n>0){
            int div = n%10;
            sum = sum + div;
            pro = pro * div;
            //System.out.print(" "+sum+" "+pro+" ");
            n = n/10;
        }
        return (pro-sum);
    }
}