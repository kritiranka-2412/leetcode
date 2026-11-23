class Solution {
    public int maximumScore(int[] nums, int k) {
        int max = nums[k],min =nums[k],i=k,j=k;
		while(i!=0 || j!=nums.length-1) {
			if(i==0)
				++j;
			else if(j==nums.length-1)
				--i;
			else if(nums[i-1]>nums[j+1])
				--i;
			else
				++j;
			min = Math.min(min,Math.min(nums[i], nums[j]));
			//System.out.println(min);
			max = Math.max(max,min*(j-i+1));
			//System.out.println(max);
		}
		return max;
    }
}