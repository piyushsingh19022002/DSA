class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[m];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ; i >=0 ; i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.empty()) map.put(nums2[i],-1);
            else map.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        int idx = 0;
        for(int ele : nums1){
            ans[idx++]=map.get(ele);
        }
        return ans;
    }
}