// class Solution { // Brute Force
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         HashSet<List<Integer>> set = new HashSet<>();

//         for(int i = 0 ; i < n ; i++){
//             for(int j = i+1 ; j < n ; j++){
//                 for(int k = j+1 ; k < n ; k++){
//                     if(nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k){
//                         List<Integer> curr = Arrays.asList(nums[i],nums[j],nums[k]);
//                         Collections.sort(curr);
//                         set.add(curr);
//                     } 
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }
// class Solution {  //Better
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         HashSet<List<Integer>> set1 = new HashSet<>();
//         HashSet<Integer> set2 = new HashSet<>();

//         for(int i = 0 ; i < n ; i++){
//             for(int j = i+1 ; j < n ; j++){
//                 int rem = -1*(nums[i]+nums[j]);
//                 if(set2.contains(rem)){
//                     List<Integer> curr = Arrays.asList(nums[i],nums[j],rem);
//                     Collections.sort(curr);
//                     set1.add(curr);
//                 }else{
//                     set2.add(nums[j]);
//                 }
//             }
//             set2.clear();
//         }
//         return new ArrayList<>(set1);
//     }
// }

class Solution {  //Optimal->Using 2 pointer
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        //Sort first
        Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            // skip if similar to prev value
            if(i>0 && nums[i]==nums[i-1]) continue;
            // else proceed
            int j = i + 1;
            int k = n - 1;
            // now check triplet in range i to k
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]) j++; // increase until different
                    while(j<k && nums[k]==nums[k+1]) k--; // decrease until different
                }
            }
        }
        return ans;
    }
}