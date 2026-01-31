class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //Updated
        List<Integer> ans = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // for(int ele : nums){
        //     if(set.contains(ele)){
        //         ans.add(ele);
        //     }
        //     set.add(ele);
        // }
        for(int i = 0 ; i < nums.length ; i++){
            int pos = Math.abs(nums[i])-1;
            if(nums[pos]<0){
                ans.add(pos+1);
            }
            nums[pos] = -1*nums[pos];
        }
        return ans;
    }
}