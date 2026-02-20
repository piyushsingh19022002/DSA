// this will works for both distinct and non distinct
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            if(set.contains(sb.reverse().toString())){
                pairs++;
                set.remove(sb.reverse().toString());
            }
            else set.add(words[i]);
        }
        
        return pairs;
    }
}
// this will work for distinct only
// class Solution {
//     public int maximumNumberOfStringPairs(String[] words) {
//         int pairs = 0;
//         HashSet<String> set = new HashSet<>();
//         for(int i = 0 ; i < words.length;i++){
//             StringBuilder sb = new StringBuilder(words[i]);
//             if(set.contains(sb.reverse().toString())){
//                 pairs++;
//             }
//             else set.add(words[i]);
//         }
        
//         return pairs;
//     }
// }