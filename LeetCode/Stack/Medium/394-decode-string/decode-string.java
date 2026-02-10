class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch==']'){
                // creating substring first
                StringBuilder sb1 = new StringBuilder();
                while(st.peek()!='['){
                    sb1.append(st.pop());
                }
                st.pop(); // remove [
                sb1.reverse(); // make it correct
                // create digit 
                int k = 0;
                int base = 1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k += (st.pop()-'0')*base;
                    base*=10;
                }
                // Create final string
                StringBuilder sb2 = new StringBuilder();
                for(int i = 0 ; i < k ; i++){
                    sb2.append(sb1);
                }
                // push the updated string char by char in stack
                for(char chr : sb2.toString().toCharArray()){
                    st.push(chr);
                }
            }
            else st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}