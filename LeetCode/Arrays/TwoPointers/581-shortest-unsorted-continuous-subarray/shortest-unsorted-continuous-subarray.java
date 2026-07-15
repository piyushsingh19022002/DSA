class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int start = -1;
        int maxSofar = nums[0];
        int end = -1;
        int minSofar = nums[n-1];

        for(int i = 1 ; i < n ; i++){
            if(nums[i]<maxSofar){
                end = i;
            }else{
                maxSofar = nums[i];
            }
        }

        for(int i = n - 2 ; i>=0 ;i--){
            if(nums[i]>minSofar){
                start = i;
            }else{
                minSofar = nums[i];
            }
        }
        if(start==-1 && end==-1) return 0;
        return end - start + 1;
    }
}