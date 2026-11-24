
class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        for(int idx = 0; idx < 2*n; idx++) {

            int i = idx % n;

            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                ans[st.pop()] = nums[i];
            }

            if(idx < n) {
                st.push(i);
            }
        }

        return ans;
    }
}
