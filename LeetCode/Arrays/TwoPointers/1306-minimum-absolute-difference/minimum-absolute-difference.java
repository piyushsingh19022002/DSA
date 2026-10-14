class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0 ; i < n-1 ; i++){
            if((arr[i+1]-arr[i])<minDiff) minDiff = arr[i+1]-arr[i];
        }
        for(int i = 0 ; i < n-1 ; i++){
            int diff = arr[i+1]-arr[i];
            if(diff==minDiff) ans.add(Arrays.asList(new Integer[]{arr[i],arr[i+1]}));
        }
        return ans;
    }
}