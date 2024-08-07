class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                stack.pop();
            }
            max = Math.max(max,stack.size());

        }
        return max;
    }
}