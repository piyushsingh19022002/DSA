class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> PSE = new ArrayList<>();
        ArrayList<Integer> NSE = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) NSE.add(n);
        int maxArea = 0;
        for(int i = 0 ; i < n ; i++ ){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.isEmpty()) PSE.add(-1);
            else PSE.add(st.peek());
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        for(int i = n-1 ; i >=0; i-- ){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(!st.isEmpty()) NSE.set(i,st.peek());
            st.push(i);
        }
        for(int i = 0 ; i < n ; i++){
            int area = heights[i]*(NSE.get(i)-PSE.get(i)-1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}