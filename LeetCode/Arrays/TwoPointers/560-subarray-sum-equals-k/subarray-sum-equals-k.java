class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
            preSum[i] = sum;
        }

        HashMap<Integer,Integer> map = new HashMap<>(); 
        int ans = 0;
        // preSum[j] - preSum[i] = k then subarray with sum k exist
        // preSum[j] - k = preSum[i] 

        for(int j = 0 ; j < n ; j++){
            if(preSum[j]==k) ans++;
            int val = preSum[j] - k;

            if(map.containsKey(val)){
                ans += map.get(val);
            }
            map.put(preSum[j],map.getOrDefault(preSum[j],0)+1);
        }
        return ans;
    }
}