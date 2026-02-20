class Solution {
    public int reverseDigit(int n){
        int ans = 0;
        while(n!=0){
            ans = ans*10+n%10;
            n/=10;
        }
        return ans;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length;i++){
            set.add(nums[i]);
            set.add(reverseDigit(nums[i]));
        }
        return set.size();
    }
}