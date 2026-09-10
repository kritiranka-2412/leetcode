class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si =0, ei=0,ans =0,p=1;
        while(ei<nums.length){
            //grow
            p = p* nums[ei];
            //shrink
            while(p>=k && si<=ei){
                p = p/nums[si];
                si++;
            }
            //ans update
            ans = ans + (ei-si+1);
            ei++;
        
        }
        return ans; 
    }
}