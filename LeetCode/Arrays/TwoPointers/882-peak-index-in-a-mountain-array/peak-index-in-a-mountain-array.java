class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;

        int low = 1;
        int high = n-2;
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {ans = mid; break;}
            else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }
}