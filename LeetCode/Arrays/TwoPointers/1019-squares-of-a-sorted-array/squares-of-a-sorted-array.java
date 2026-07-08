class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] square = new int[n];

        int low = 0;
        int high = n-1;
        int writePos = n-1;

        while(low<=high){
            int sql = nums[low]*nums[low];
            int sqh = nums[high]*nums[high];

            if(sql>sqh){
                square[writePos] = sql;
                low++;
            }else{
                square[writePos] = sqh;
                high--;
            }
            writePos--;
        }
        return square;
    }
}