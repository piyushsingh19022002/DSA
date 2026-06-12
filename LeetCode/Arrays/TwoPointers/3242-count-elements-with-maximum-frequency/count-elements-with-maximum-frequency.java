class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxF = Collections.max(map.values());
        for(int val : map.values()){
            if(val==maxF) ans +=val;
        }
        return ans;
    }
}