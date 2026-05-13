class Solution { // Brute Force Approach
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;
        
        for(int i = 0 ; i < n ; i++){
            int incre = 0;
            int decre = 0;
            int j = i + 1;

            while(j<n && arr[j]>arr[j-1]){
                incre = 1;
                j++;
            }

            while(j<n && arr[j]<arr[j-1]){
                decre = 1;
                j++;
            }

            if(incre==1 && decre==1) ans = Math.max(ans,j-i);
        }
        return ans;
    }
}
// class Solution { // Better Approach
//     public int longestMountain(int[] arr) {
//         int n = arr.length;
//         if(n<3) return 0;
//         int maxL = 0;
//         for(int i = 1 ; i < n-1 ; i++){
//             if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
//                 int start = i;
//                 int end = i;
//                 while(start>=1 && arr[start]>arr[start-1]) start--;
//                 while(end<n-1 && arr[end]>arr[end+1]) end++;
//                 maxL = Math.max(end-start+1,maxL);
//             };
//         }
//         return maxL;
//     }
// }