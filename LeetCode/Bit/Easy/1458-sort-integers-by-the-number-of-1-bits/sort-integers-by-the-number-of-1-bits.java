class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n-1;i++){
            for(int j = 0 ; j < n-i-1;j++){
                if(Integer.bitCount(arr[j])>Integer.bitCount(arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}