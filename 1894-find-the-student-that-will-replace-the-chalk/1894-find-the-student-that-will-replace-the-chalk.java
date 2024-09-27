class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int count = 0;
        while(k>=0){
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]<=k){
            k = k-chalk[i];
            count++;
            }
            else
            return i; 
        }
     }
     int p = count%chalk.length;
     return p;
    }
}