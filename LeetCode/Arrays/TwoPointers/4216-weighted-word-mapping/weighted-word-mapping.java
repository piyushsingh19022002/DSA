class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        char[] ans = new char[n];
        int idx = 0;
        for(int i = 0 ; i < n ; i++){
            char[] arr = words[i].toCharArray();
            int sum = 0;
            for(int j = 0 ; j < arr.length ; j++){
                int weight = weights[arr[j]-'a'];
                sum += weight;
            }
            sum = sum % 26;
            sum = 97+26-sum-1;
            ans[idx++] = (char)sum;
        }
        return new String(ans);
    }
}