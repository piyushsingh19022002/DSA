class Solution {
    public String toBinary(int n){
        StringBuilder ans = new StringBuilder();
        while(n>0){
            ans.append(n%2);
            n/=2;
        }
        return ans.reverse().toString();
    }
    public boolean hasAlternatingBits(int n) {
        String binary = toBinary(n);
        if(binary.length()==1) return true;
        for(int i = 0 ; i < binary.length()-1;i++){
            if(binary.charAt(i)==binary.charAt(i+1)) return false;
        }
        return true;
    }
}