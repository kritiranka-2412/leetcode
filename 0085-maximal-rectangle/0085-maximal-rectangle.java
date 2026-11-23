class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] ans = new int[matrix[0].length];
        int area = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1')
                    ans[j]++;
                else
                    ans[j]=0;
            }
            area = Math.max(MaxArea(ans),area);
        }
        return area;
    }
    public int MaxArea(int[] ans){
        Stack<Integer> st = new Stack<>();
        int area =0;
        for(int i=0;i<ans.length;i++){
            while(!st.isEmpty() && ans[st.peek()]>ans[i]){
                int h = ans[st.pop()];
                
                int l = i;
                if(st.isEmpty())
                area = Math.max(area,h*(l));
                else{
                    area = Math.max(area, h*(l-st.peek()-1));
                }
            }
            st.push(i);
        }
        int r = ans.length;
        while(!st.isEmpty()){
            int h = ans[st.pop()];
            if(st.isEmpty()){
                area = Math.max(area,h*(r));
            }
            else
                area = Math.max(area,h*(r-st.peek()-1));
        }
        return area;
    }
}