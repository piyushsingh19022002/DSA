class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = 1;
        int prePro = 1;
        for(int i = 1 ; i < n ; i++){
            prePro *= nums[i-1];
            pre[i] = prePro;
        }
        int suffPro = 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            pre[i] =  pre[i] * suffPro;
            suffPro *= nums[i];
        }
        return pre;
    }
}