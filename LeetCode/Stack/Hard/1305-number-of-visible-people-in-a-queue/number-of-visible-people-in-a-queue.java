class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            // if view is bloked for the stack's top element increase count and pop that
            while(!st.isEmpty() && heights[i]>=heights[st.peek()]){
                ans[st.peek()]++;
                st.pop();
            }
            // if view is not blocked by the current element that means stack'top element is able to see current element increase count is top available;
            if(!st.isEmpty()) ans[st.peek()]++;
            // always push
            st.push(i);
        }
        return ans;
    }
}