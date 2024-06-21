class Solution {
    public int firstUniqChar(String s) {
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if(index == lastIndex)
                return index;

        }
        return -1;
    }
}