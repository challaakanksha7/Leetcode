class Solution {
    private static void reverse(StringBuilder sb, int start, int end){
            while(start<end){
                char temp = sb.charAt(start);
                sb.setCharAt(start++, sb.charAt(end));
                sb.setCharAt(end--, temp);
            }
        }
    public String reverseParentheses(String s) {
        Stack<Integer> openParanthesesIndices = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='('){
                openParanthesesIndices.push(result.length());
                System.out.println(result.length());
            }
            else if(c == ')'){
                int start = openParanthesesIndices.pop();
                reverse(result, start, result.length()-1 );
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
}