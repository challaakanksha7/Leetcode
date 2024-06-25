class Solution {
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        int[] tribonnaci = new int[n+1];
        tribonnaci[0] = 0;
        tribonnaci[1] = 1;
        tribonnaci[2] = 1;
        for(int i = 3; i <= n; i++){
            tribonnaci[i] = tribonnaci[i-1]+tribonnaci[i-2]+tribonnaci[i-3];
        }
        return tribonnaci[n];

    }
}