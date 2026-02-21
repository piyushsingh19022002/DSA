class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : freq.values()){
            if(set.contains(val)) return false;
            else set.add(val);
        }
        return true;
    }
}