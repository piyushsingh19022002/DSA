class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int low = 1, high = n-2; // we will eliminate if first is ans or last by if condi
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
            // apne ans ke check ke baad hame check karna h ki konsi side hamara ans ho sakta h
            // even,odd pos wale element agar same h to hamara ans right side hoga
            if(arr[mid]==arr[mid-1]){
                if(mid%2==0) high = mid - 1;
                else low = mid + 1;
            }else if(arr[mid]==arr[mid+1]){
                if(mid%2==0) low = mid + 1;
                else high = mid - 1;
            }
        }
     return -1;
    }
}