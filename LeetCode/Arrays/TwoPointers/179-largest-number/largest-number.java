class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] num = new String[n];
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            num[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));
        if(num[0].equals("0")) return "0";

        for(int i = 0 ; i < n ; i++){
            sb.append(num[i]);
        }
        return sb.toString();
    }
}