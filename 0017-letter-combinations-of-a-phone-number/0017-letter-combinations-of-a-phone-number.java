class Solution {
    public static void solve(String digits, Map<Character, String> Dial, List<String> result, String ans, int i){
        if(i == digits.length()){
            result.add(ans);
            return;
        }
        else{
            char ch = digits.charAt(i);
            String str = Dial.get(ch);
            for(int j = 0; j < str.length();j++){
                solve(digits, Dial, result, ans+str.charAt(j), i+1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits.length()==0){
            return result;}
        Map<Character, String> Dial = new HashMap<Character, String>();
        Dial.put('2',"abc");
        Dial.put('3',"def");
        Dial.put('4',"ghi");
        Dial.put('5',"jkl");
        Dial.put('6',"mno");
        Dial.put('7',"pqrs");
        Dial.put('8',"tuv");
        Dial.put('9',"wxyz");
        String ans = "";
        solve(digits,Dial,result,ans,0);
        return result;
    }
}