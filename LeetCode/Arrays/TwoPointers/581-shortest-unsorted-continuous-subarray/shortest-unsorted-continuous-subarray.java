class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] cpy = nums.clone();
        Arrays.sort(cpy);
        int i = 0;
        int j = n - 1;
        while(i<j && nums[i]==cpy[i])i++;
        while(i<j && nums[j]==cpy[j])j--;
        return i==j?0:j-i+1;
    }
}
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