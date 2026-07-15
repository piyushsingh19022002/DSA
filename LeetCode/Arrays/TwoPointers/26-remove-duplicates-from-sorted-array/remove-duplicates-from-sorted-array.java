class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0;
        int fast = 0;

        while(fast<n){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}