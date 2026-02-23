class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k) return false;
        HashSet<String> set = new HashSet<>();
        int i = 0;
        int j = k;
        while(j!=s.length()){
            String sub = s.substring(i,j);
            set.add(sub);
            if(set.size()==1<<k) return true; // 1<<k == 2^k
            i++;
            j++;
        }
        set.add(s.substring(i));
        return set.size()==1<<k;
    }
}