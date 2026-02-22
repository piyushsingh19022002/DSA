class Solution {
    public int rev(int n){
        int ans = 0;
        while(n!=0){
            ans = ans * 10 + n % 10;
            n/=10;
        }
        return ans;
    }
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            int diff = nums[i]-rev(nums[i]);
            if(map.containsKey(diff)){
                int freq = map.get(diff);
                count+=freq;
                count%=1000000007;
                map.put(diff,freq+1);
            }else{
                map.put(diff,1);
            }
        }
        return count;
    }
}