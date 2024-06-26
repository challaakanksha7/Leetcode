class Solution {
    public static void solve(int n, List<String> pairs, String ans, int open, int close){
        if(open == n && close == n){
            pairs.add(ans);
            return;
        }
        else{
            if(open<n){
                solve(n,pairs, ans+'(',open+1,close);
            }
            if(open>close){
                solve(n,pairs, ans+')',open,close+1);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> pairs = new ArrayList<String>();
        String ans = "";
        int open = 0;
        int close = 0;
        solve(n, pairs, ans, 0, 0);
        return pairs;
    }
}