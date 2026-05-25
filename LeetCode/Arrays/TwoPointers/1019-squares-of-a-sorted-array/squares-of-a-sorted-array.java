// class Solution { // brute force
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] sq = new int[n];
//         // making original array sort a/c absolute val
//         for(int i = 0 ; i < n ; i++){
//             nums[i] = Math.abs(nums[i]);
//         }
//         Arrays.sort(nums);
//         // square it and store one by one
//         for(int i = 0 ; i < n ; i++){
//             sq[i] = (int)Math.pow(nums[i],2);
//         }
//         return sq;
//     }
// }
class Solution { // optimal -> 2 pointer
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int[] sq = new int[n];
        int k = n-1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                sq[k] = nums[i]*nums[i];
                i++;
            }else{
                sq[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return sq;
    }
}
