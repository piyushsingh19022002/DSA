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
        int max = Integer.MIN_VALUE;
        boolean broken = false;

        // 1. Sabse pehle "kharab" section ka Global Min dhundho
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) broken = true;
            if (broken) min = Math.min(min, nums[i + 1]);
        }

        if (!broken) return 0; // Array sorted hai

        // 2. Peeche se scan karke Global Max dhundho
        broken = false;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) broken = true;
            if (broken) max = Math.max(max, nums[i - 1]);
        }

        // 3. Min ke liye sahi jagah: Pehla index jahan value 'min' se badi hai
        int start = 0;
        while (start < n && nums[start] <= min) {
            start++;
        }

        // 4. Max ke liye sahi jagah: Peeche se pehla index jahan value 'max' se choti hai
        int end = n - 1;
        while (end >= 0 && nums[end] >= max) {
            end--;
        }

        return end - start + 1;
    }
}