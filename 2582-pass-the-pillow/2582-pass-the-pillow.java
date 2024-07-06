class Solution {
    public int passThePillow(int n, int time) {
        int i = 1;
        int j = 1;
        while(i<=time){
            if(j<n)
            {
                j++;
            }
            else{
                j--;
            }
            i++;
        }
        return j;
    }
}