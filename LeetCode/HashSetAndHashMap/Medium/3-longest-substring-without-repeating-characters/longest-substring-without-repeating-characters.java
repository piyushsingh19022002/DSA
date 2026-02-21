class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(s.charAt(0),0);
        int maxLength = 0;
        int i = 0;
        int j = 1;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int len = j - i;
                maxLength = Math.max(maxLength,len);
                i = Math.max(map.get(ch)+1,i);
            }
            map.put(ch,j);
            j++;
        }
        maxLength = Math.max(maxLength,j-i);
        return maxLength;
    }
}