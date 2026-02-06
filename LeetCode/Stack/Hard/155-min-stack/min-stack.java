class MinStack {
    Stack<Integer> st;
    int min;
    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE; 
    }
    
    public void push(int val) {
        if(val<=min){
            st.push(min);
            min = val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(min==st.peek()){
            st.pop();
            min = st.peek();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}
// class MinStack {
//     Stack<Integer> main;
//     Stack<Integer> min;
//     public MinStack() {
//         main = new Stack<>();
//         min = new Stack<>();
//     }
    
//     public void push(int val) {
//         main.push(val);
//         if(min.isEmpty()|| val<=min.peek()){
//             min.push(val);
//         }
//     }
    
//     public void pop() {
//         if(main.peek().equals(min.peek())){
//             min.pop();
//         }
//         main.pop();
//     }
    
//     public int top() {
//         return main.peek();
//     }
    
//     public int getMin() {
//         return min.peek();
//     }
// }

// class MinStack {
//     Stack<Integer> stack;
//     int min;
//     public MinStack() {
//         stack = new Stack<>();
//         min = Integer.MAX_VALUE;
//     }
    
//     public void push(int val) {
//         stack.push(val);
//         min = Math.min(val,min);
//         stack.push(min);
//     }
    
//     public void pop() {
//         stack.pop();
//         stack.pop(); 
//         min = stack.empty() ? Integer.MAX_VALUE : stack.peek();
//     }
    
//     public int top() {
//         return stack.get(stack.size()-2);
//     }
    
//     public int getMin() {
//         return stack.peek();
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */