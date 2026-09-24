class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int temp = nums[i];
            while(temp>0){
                int n = temp%10;
                sum+=n;
                
                temp/=10;
            }
            if(sum==i)
            return i;
        }
        return -1;
    }
}