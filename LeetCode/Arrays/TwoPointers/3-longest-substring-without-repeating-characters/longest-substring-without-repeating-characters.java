class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> lastSeen = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int currLen = 0;
        for(int right = 0 ; right < n ; right++){
            if(lastSeen.containsKey(s.charAt(right)) && lastSeen.get(s.charAt(right))>=left){
                left = lastSeen.get(s.charAt(right)) + 1;
            } 
            lastSeen.put(s.charAt(right),right);
            currLen = right - left + 1;
            maxLen = Math.max(currLen,maxLen);
        }
        return maxLen;
    }
}