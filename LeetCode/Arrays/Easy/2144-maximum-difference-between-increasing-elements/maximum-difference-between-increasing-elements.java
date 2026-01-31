// class Solution {
//     public int maximumDifference(int[] nums) {
//         // Solution -> Brute Force //Problem -> o(n^2)
//         int n = nums.length;
//         int maxd = -1;
//         for(int i = 0 ; i < n ;i++){
//             for(int j = i+1 ; j < n ; j++){
//                 if(nums[i]<nums[j]){
//                     if(nums[j]-nums[i]>maxd) maxd=nums[j]-nums[i];
//                 }
                
//             }
//         }
//         return maxd;
//     }
// }

class Solution {
    public int maximumDifference(int[] nums) {
        // Solution -> Optimized 
        int n = nums.length;
        // create a var to store maxd and initialize it with -1;
        int maxd = -1;
        // create min to store the min value that has increasing order
        int min = nums[0];

        for(int i = 1 ; i < n ; i++){
            if(nums[i]>min){
                // find or update diff only if it is greater than previous one
                maxd = Math.max(nums[i]-min,maxd);
            }else{
                // else update min
                min = nums[i];
            }
        }
        return maxd;
    }
}