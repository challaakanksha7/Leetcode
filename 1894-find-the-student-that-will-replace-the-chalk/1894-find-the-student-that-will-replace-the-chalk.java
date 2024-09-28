class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        while(k>0){
            for(i = 0; i < chalk.length; i++){
                k = k - chalk[i];
                //System.out.println(k);
                if(k==0){
                    return (i+1)%chalk.length;
                }
                if(k<0){
                    return i;
                }
                
            }
    }
        //System.out.println("i:"+i);
        return i;
        
    }
}