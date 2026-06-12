class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String , ArrayList<String>> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            // sorting ele of arr
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // creating list or adding

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}