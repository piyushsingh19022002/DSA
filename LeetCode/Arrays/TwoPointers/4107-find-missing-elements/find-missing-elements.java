class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            set.add(nums[i]);
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}