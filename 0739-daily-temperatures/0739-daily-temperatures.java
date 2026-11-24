class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int t = st.pop();
                ans[t] = i-t;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = 0;
        }
        return ans;
    }
}