class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String s:logs){
            if(s.equals("./")){
                count = count+0;
                System.out.println("./"+count);
            }
                
            else if(s.equals("../") && count != 0){
                count = count - 1;
                System.out.println("../"+count);
            }
                
            else if(s.charAt(0) != '.'){
                count = count + 1;
                System.out.println("x"+count);
            }
                
        }
        return count;
    }
}