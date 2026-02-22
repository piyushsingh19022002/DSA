class Solution {
    public int binaryGap(int n) {
        int maxLength = 0;
        String binary = Integer.toBinaryString(n);
        int size = binary.length();
        int i = 0;
        int j = 1;
        while(j<size){
            if(binary.charAt(j)=='1'){
                int len = j - i;
                maxLength = Math.max(maxLength,len);
                i = j;
            }
            j++;
        }
        return maxLength;
    }
}