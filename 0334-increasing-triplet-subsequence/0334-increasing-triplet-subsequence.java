class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] leftmin = new int[nums.length];
        leftmin[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            leftmin[i] = Math.min(leftmin[i-1],nums[i-1]);
        }
        int[] rightmax = new int[nums.length];
        rightmax[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightmax[i] = Math.max(nums[i+1],rightmax[i+1]);
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>leftmin[i] && nums[i]<rightmax[i])
                return true;
        }
        return false;
    }
}