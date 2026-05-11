class Solution {
    public void extract(List<Integer> arr,int val){
        List<Integer> ex = new ArrayList<>();
        while(val!=0){
            ex.add(val%10);
            val/=10;
        }
        for(int i = ex.size()-1;i>=0 ; i--){
            arr.add(ex.get(i));
        }
    }
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(Math.abs(nums[i])<10) ls.add(nums[i]);
            else extract(ls,nums[i]);
        }
        int[] ans = ls.stream().mapToInt(i->i).toArray();
        return ans;
    }
}