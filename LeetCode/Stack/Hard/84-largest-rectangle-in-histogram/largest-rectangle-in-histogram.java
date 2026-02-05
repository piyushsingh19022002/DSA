class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] PSE = new int[n];
        int[] NSE = new int[n];

        // ---------- PSE ----------
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            PSE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // clear stack
        st.clear();

        // ---------- NSE ----------
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            NSE[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // ---------- AREA ----------
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = NSE[i] - PSE[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}