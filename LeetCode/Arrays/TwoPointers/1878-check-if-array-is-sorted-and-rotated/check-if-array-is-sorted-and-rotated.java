class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int deviation = 0;

        for(int i = 0 ; i < len ; i++){
            if(i < len-1 && nums[i]>nums[i+1]){
                deviation++;
            }else if(i == len-1 && nums[len-1]>nums[0]){
                deviation++;
            }
        }

        if(deviation>1) return false;
        else return true;
        
    }
}

// class Solution { // Brute Force
//     public void rotateByOne(int[] nums){
//         int i = 1,j = nums.length-1;
//         while(i<j){
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++;j--;
//         }
//         i = 0;j = nums.length-1;
//         while(i<j){
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++;j--;
//         }
//     }
//     public boolean isSorted(int[] nums){
//         for(int i = 0 ; i < nums.length-1 ;i++){
//             if(nums[i]>nums[i+1]) return false;
//         }
//         return true;
//     }
//     public boolean check(int[] nums) {
//         int len = nums.length;
//         if(len<3) return true;
//         for(int i = 0 ; i < len ; i++){
//             rotateByOne(nums);
//             if(isSorted(nums)) return true;
//         }
//         return false;
//     }
// }