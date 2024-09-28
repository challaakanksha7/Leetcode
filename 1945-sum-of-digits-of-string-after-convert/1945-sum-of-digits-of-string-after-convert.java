class Solution {
    public int getLucky(String s, int k) {
        //char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            int i = c - 'a' + 1;
            sb.append(i);
            System.out.println(sb);
        }
        String str = sb.toString();
        while(k-- > 0){
            int sum = 0;
            for(char d : str.toCharArray()){
                sum += d - '0';
            }
            if(sum < 0){
                return sum;
            }
            str = Integer.toString(sum);
        }
        return Integer.parseInt(str);
    }
}