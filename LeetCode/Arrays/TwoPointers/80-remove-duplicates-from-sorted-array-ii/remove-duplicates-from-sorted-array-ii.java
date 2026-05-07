class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int slow = 2;
        // slow woh jagah h jaha update karna h
        // fast dekhta h ki kya update karna h -> unique value
        for(int fast = 2 ; fast < n ; fast++){
            // agar slow - 2 wali value hi fast me h to skip
            // agar unique value mili to update value and slow
            if(nums[slow-2]!=nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}