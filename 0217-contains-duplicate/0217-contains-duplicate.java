class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Number> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}