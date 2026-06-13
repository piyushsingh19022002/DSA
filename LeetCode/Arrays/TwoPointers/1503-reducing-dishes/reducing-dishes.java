class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        int suffixSum = 0;
        int ans = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            if(suffixSum+satisfaction[i]<0) break;
            suffixSum += satisfaction[i];
            ans = ans+suffixSum;
        }
        return ans;
    }
}