class Solution {
    public int minStartValue(int[] nums) {
        int minVal = 0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
            minVal = Math.min(minVal,sum);
        }
        return 1 - minVal;
    }
}