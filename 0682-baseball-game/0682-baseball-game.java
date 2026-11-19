class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String x:operations){
            if(x.equals("C"))
                st.pop();
            else if(x.equals("D")){
                int a = st.peek();
                st.push(2*a);
            }
            else if(x.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }
            else
                st.push(Integer.parseInt(x));

        }
        int sum =0;
        for(int i:st)
            sum+=i;
        return sum;
    }
}