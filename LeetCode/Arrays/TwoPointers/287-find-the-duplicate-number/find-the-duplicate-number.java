class Solution {

    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Detect cycle
        while (true) {

            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        // Find duplicate
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}