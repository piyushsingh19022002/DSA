class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n<3) return 0;
        int maxL = 0;
        for(int i = 1 ; i < n-1 ; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int start = i;
                int end = i;
                while(start>=1 && arr[start]>arr[start-1]) start--;
                while(end<n-1 && arr[end]>arr[end+1]) end++;
                maxL = Math.max(end-start+1,maxL);
            };
        }
        return maxL;
    }
}