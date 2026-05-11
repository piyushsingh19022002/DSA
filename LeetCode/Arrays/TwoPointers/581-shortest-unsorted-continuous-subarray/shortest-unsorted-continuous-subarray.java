// class Solution { 
//     public int findUnsortedSubarray(int[] nums) {
//         int n = nums.length;
//         int[] cpy = nums.clone();
//         Arrays.sort(cpy);
//         int i = 0;
//         int j = n - 1;
//         while(i<j && nums[i]==cpy[i])i++;
//         while(i<j && nums[j]==cpy[j])j--;
//         return i==j?0:j-i+1;
//     }
// }
// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int n = nums.length;
//         if(n==1) return 0;
//         int i = 0; 
//         int j = n-1;

//         while(i<j){
//             if(nums[i]>nums[i+1] && nums[j]<nums[j-1]){
//                 break;
//             }else if(nums[i]<=nums[i+1]){
//                 i++;
//             }else if(nums[j]>=nums[j-1]){
//                 j--;
//             }else{
//                 continue;
//             }
//         }
//         return i==j?0:j-i+1;
//     }
// }

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int st = -1;
        int max = Integer.MIN_VALUE;
        int end = -1;

        // finding the smallest element which is unsorted
        for(int i = 1 ; i < n; i++){
            if(nums[i]<nums[i-1] && st==-1){
                min = nums[i];
                st = i;
            }
            if(st!=-1) min = Math.min(min,nums[i]);
        }
        if(st==-1) return 0;
        for(int j = n-2 ; j >=0 ;j--){
            if(nums[j]>nums[j+1] && end==-1){
                max = nums[j];
                end = j;
            }
            if(end!=-1) max = Math.max(max,nums[j]);
        }
        st = 0 ;end = n-1;
        while(st<n && nums[st]<=min) st++;
        while(end>=0 && nums[end]>=max) end--;
        return end-st+1;
    }
}