class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i <32;i++){
            result=result<<1; // left shift karke jagah banai ane wale bit ke liye
            result = result | (n & 1); // result me last bit dali
            n = n >> 1; // apne n ko right shift kiye taki agle iteration m lsb change ho jaye
        }
        return result;
    }
}