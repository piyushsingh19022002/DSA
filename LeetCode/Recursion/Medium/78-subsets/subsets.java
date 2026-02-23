class Solution {
    public void helper(int i,int[] nums,ArrayList<Integer> arr,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        helper(i+1,nums,arr,ans);
        arr.add(nums[i]);
        helper(i+1,nums,arr,ans);
        arr.remove(arr.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        helper(0,nums,arr,ans);
        return ans;
    }
}