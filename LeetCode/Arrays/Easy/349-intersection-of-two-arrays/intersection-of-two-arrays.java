class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums1){
            set.add(ele);
        }
        HashSet<Integer> common = new HashSet<>();
        for(int ele:nums2){
            if(set.contains(ele)){
                common.add(ele);
            }
        }
        int[] ans = new int[common.size()];
        int i = 0;
        for(int ele : common){
            ans[i++]=ele;
        }
        return ans;
    }
}