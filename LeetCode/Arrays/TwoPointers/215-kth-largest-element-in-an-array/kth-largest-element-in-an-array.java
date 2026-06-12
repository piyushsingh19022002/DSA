class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        // TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());

        // for(int i = 0 ; i < n ;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // int count = 0;

        // for(int key : map.keySet()){
        //     count++;
        //     if(k==count) return key;
        // }
        // return -1;
        Arrays.sort(nums);
        return nums[n-k];
    }
}