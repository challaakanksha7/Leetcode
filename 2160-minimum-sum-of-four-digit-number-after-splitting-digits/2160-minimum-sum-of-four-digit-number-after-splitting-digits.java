class Solution {
    public int minimumSum(int num) {
        int new1;
        int new2;
        int i = 0;
        int[] arr = new int[4];
        while(num>0){
            arr[i] = num%10;
            num= num/10;
            i = i + 1;
        }
        Arrays.sort(arr);
        new1 = arr[0]*10 + arr[2];
        new2 = arr[1]*10 + arr[3];
        for(int j = 0; j < 4; j++){
            System.out.print(arr[j]);
        }
        
        return new1+new2;
    }
}