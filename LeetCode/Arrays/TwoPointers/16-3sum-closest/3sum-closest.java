// class Solution { // Brute Force
//     public int threeSumClosest(int[] nums, int target) {
//         int n = nums.length;
//         int closest = Integer.MAX_VALUE;
//         int ans = 0;
//         for(int i = 0 ; i < n ; i++){
//             for(int j = i + 1 ; j < n ; j++){
//                 for(int k = j + 1 ; k < n ; k++){
//                     int sum = nums[i]+nums[j]+nums[k];
//                     int diff = Math.abs(sum-target);
//                     if(closest>diff){
//                         closest = diff;
//                         ans = sum;
//                     } 
//                 }
//             }
//         }
//         return ans;
//     }
// }



class Solution { // Optimal Approach
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int csum = nums[i]+nums[j]+nums[k];
                int cdiff = Math.abs(target-csum);

                if(cdiff<diff){
                    diff = cdiff;
                    sum = csum;
                }

                if(csum>target)k--;
                else if(csum<target)j++;
                else return csum;
            }
        }
        return sum;
    }
}