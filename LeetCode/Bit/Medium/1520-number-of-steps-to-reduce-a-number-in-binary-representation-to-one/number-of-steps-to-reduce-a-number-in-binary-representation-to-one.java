class Solution {
    public String sum(String a,String b){
        StringBuilder ans = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0||j>=0||carry>0){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }if(j>=0){
                sum+=a.charAt(j)-'0';
                j--;
            }
            ans.append(sum%2);
            carry = sum/2;
        }
        return ans.reverse().toString();
    }
    public int numSteps(String s) {
        String cpy = s;
        if(s.length()==1 && s.charAt(0)=='1') return 0;
        int step = 0;
        while(cpy.length()!=1){
            if(cpy.charAt(cpy.length()-1)=='0') cpy = cpy.substring(0,cpy.length()-1);
            else cpy = sum(cpy,"1");
            step+=1;
        }
        return step;
    }
}