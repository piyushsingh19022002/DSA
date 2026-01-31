// class Solution {
//     public int[] replaceElements(int[] arr) {
//         // Solution -> Brute Force // Problem -> o(n^2)
//         int n = arr.length;
//         int[] ans = new int[n];
//         for(int i = 0 ; i < n ; i++){
//             if(i==n-1){
//                 ans[i] = -1;
//                 break;
//             }
//             int max = Integer.MIN_VALUE;
//             for(int j = i+1 ; j < n ; j++){
//                 if(arr[j]>max) max = arr[j];
//             }
//             ans[i] = max;
//         }
//         return ans;
//     }
// }


class Solution {
    public int[] replaceElements(int[] arr) {
        // Solution -> Optimized 
        int n = arr.length;
        int[] ans = new int[n];
        // create a var max and and initialize it with -1
        int max = -1;
        // iterate from n->1 and update value of max and update ans in next loop
        for(int i = n-1 ; i >=0 ; i--){
            ans[i] = max;
            max = Math.max(max,arr[i]);
        }
        return ans;
    }
}

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         int max = -1;
//         int currval = arr[n-1];
//         for(int i = n-1 ; i >= 1 ; i--){
//             arr[i] = max;
//             max = Math.max(currval,max);
//             currval = arr[i-1];
//         }
//         return arr;
//     }
// }