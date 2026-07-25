class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        int tmp = n;
        while(tmp!=0){
            int digit =  tmp % 10;
            if(digit>max1){
                max2 = max1;
                max1 = digit;
            }else if(digit>max2 && digit<=max1){
                max2 = digit;
            }
            tmp/=10;
        }
        return max1 * max2;
    }
}