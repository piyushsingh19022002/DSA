// class Solution {
//     public int countSetBits(int n){
//         int ans = 0;
//         String bit = Integer.toBinaryString(n);
//         for(int i = 0 ; i < bit.length();i++){
//             if(bit.charAt(i)=='1') ans++;
//         }
//         return ans;
//     }
//     public boolean isPrime(int val){
//         if(val<=1) return false;
//         for(int i = 2; i <=Math.sqrt(val);i++){
//             if(val%i==0) return false;
//         }
//         return true;
//     }
//     public int countPrimeSetBits(int left, int right) {
//         int primes = 0;
//         for(int i = left; i <=right;i++){
//             if(isPrime(countSetBits(i))) primes++;
//         }
//         return primes;
//     }
// }
class Solution {
    public boolean isPrime(int val){
        if(val<=1) return false;
        for(int i = 2; i <=Math.sqrt(val);i++){
            if(val%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int primes = 0;
        for(int i = left; i <=right;i++){
            if(isPrime(Integer.bitCount(i))) primes++;
        }
        return primes;
    }
}