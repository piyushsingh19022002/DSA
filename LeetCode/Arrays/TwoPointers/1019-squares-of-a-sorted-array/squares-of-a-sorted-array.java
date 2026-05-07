class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sq = new int[n];
        // making original array sort absolute
        for(int i = 0 ; i < n ; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            sq[i] = (int)Math.pow(nums[i],2);
        }
        return sq;
    }
}