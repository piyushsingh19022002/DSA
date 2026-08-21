class Solution {
    public int getDigitP(int val){
        int pro = 1;
        while(val!=0){
            pro = pro * (val % 10);
            val /= 10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        for(int i = n ; i < n+t ; i++){
            if(getDigitP(i)%t==0) return i;
        }
        return 0;
    }
}