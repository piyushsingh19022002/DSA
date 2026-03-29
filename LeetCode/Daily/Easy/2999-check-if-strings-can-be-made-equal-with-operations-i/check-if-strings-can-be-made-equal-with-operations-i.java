class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder ns1 = new StringBuilder(s1);
        StringBuilder ns2 = new StringBuilder(s2);
        int i = 0 , j = 2; // just for calculation
        for(int k = 0 ; k < 4 ; k++){
            char temp = ns1.charAt(i);
            ns1.setCharAt(i,ns1.charAt(j));
            ns1.setCharAt(j,temp);
            if(ns1.toString().equals(ns2.toString())) return true;
            if(k%2==0){
                i = i+1;
                j = j+1;
            }else{
                i = i-1;
                j = j-1;
            }
        }
        return false;
    }
}