// class Solution { // -> Brute Force
//     public int[] sortByBits(int[] arr) {
//         int n = arr.length;
//         Arrays.sort(arr);
//         for(int i = 0; i < n-1;i++){
//             for(int j = 0 ; j < n-i-1;j++){
//                 if(Integer.bitCount(arr[j])>Integer.bitCount(arr[j+1])){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         return arr;
//     }
// }
// class Solution { // -> wrong because custom sorting doesnot support primitve data type
//     public int[] sortByBits(int[] arr) {
//         Arrays.sort(arr,(a,b)->{
//             int countA = Integer.bitCount(a);
//             int countB = Integer.bitCount(b);
//             if(countA==countB) return a - b;
//             return countA - countB;
//         });
//         return arr;
//     }
// }
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp,(a,b)->{
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if(countA==countB) return a - b;
            return countA - countB;
        });
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}