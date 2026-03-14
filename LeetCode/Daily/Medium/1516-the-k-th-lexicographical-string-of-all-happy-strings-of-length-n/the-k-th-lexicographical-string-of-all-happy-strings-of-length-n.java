class Solution {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        generateStrings(n, "", happyStrings, k);
        
        // Check if we actually found at least k strings
        return happyStrings.size() < k ? "" : happyStrings.get(k - 1);
    }

    private void generateStrings(int n, String current, List<String> result, int k) {
        // Optimization: Stop searching if we've already found k strings
        if (result.size() == k) return;

        // Base case: we reached the target length
        if (current.length() == n) {
            result.add(current);
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {
            // Check the "happy" condition: no two adjacent characters are the same
            if (current.length() == 0 || current.charAt(current.length() - 1) != c) {
                generateStrings(n, current + c, result, k);
            }
        }
    }
}