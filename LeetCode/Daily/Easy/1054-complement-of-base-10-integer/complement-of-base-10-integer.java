// class Solution { // Method 1 - brute force
//     public int bitwiseComplement(int n) {
//         StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
//         for(int i = 0; i<sb.length();i++){
//             if(sb.charAt(i)=='1') sb.setCharAt(i,'0');
//             else sb.setCharAt(i,'1');
//         }
//         return Integer.parseInt(sb.toString(),2);
//     }
// }
// class Solution { // Method 2 - better using log n TC
//     public int bitwiseComplement(int n) {
//         if(n==0) return 1;
//         int counter = 0;
//         int ans = 0;
//         while(n!=0){
//             int msb = n%2;
//             ans += Math.pow(2,counter++) *(msb==1?0:1);
//             n/=2;
//         }
//         return ans;
//     }
// }
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int noOfBits = (int)Math.floor(Math.log(n)/Math.log(2))+1;
        int masked = (int)Math.pow(2,noOfBits)-1;
        return n ^ masked;
    }
}