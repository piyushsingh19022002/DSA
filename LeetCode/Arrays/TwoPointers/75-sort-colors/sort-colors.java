// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0, mid = 0, high = nums.length - 1;

//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 // swap(nums, low, mid);
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             } else if (nums[mid] == 1) {
//                 mid++;
//             } else { // nums[mid] == 2
//                      // swap(nums, mid, high);
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}