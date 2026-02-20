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