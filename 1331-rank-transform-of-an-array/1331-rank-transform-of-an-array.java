class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank = 1;
        int[] a = arr.clone();
        Arrays.sort(a);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            if(!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}