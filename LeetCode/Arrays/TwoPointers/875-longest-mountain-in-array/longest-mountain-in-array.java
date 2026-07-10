class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxRange = 0;
        if(n<3) return maxRange;

        int i = 1;

        while(i<n-1){
            boolean isPeak = arr[i]>arr[i-1] && arr[i]>arr[i+1];

            if(isPeak){
                int start = i;
                int end = i;

                while(start>0 && arr[start]>arr[start-1]) start--;
                while(end<n-1 && arr[end]>arr[end+1]) end++;

                maxRange = Math.max(maxRange,end-start+1);

                i = end;
            }else i++;
        }
        return maxRange;
    }
}