class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        //linear maxsum of a subarray
        int linsum = max(nums);
        //ab hum min sum of subarray nikalenge
        int maxsum = 0;
        //yeh humne puri array ka sum nikal liya h
        for(int i=0;i<nums.length;i++){
            maxsum+=nums[i];
            nums[i]*=-1;  //yeh hum isliye karenge taki ab jab hum next baar kadans laga rhe h toh usse min sum ki value aa jaayegi par kyuki humne array ko -1 se multiply kar diya hai that means jo hamara minimum sam h uska sign chng hogya hoga
        }
        int minsum = max(nums);
        // due to sign chng of minsum we will perform addition vrna subtraction krte
        int csum = maxsum+minsum;
        if(csum==0)
        return linsum;
        if(csum<linsum)
        return linsum;
        return csum;


    }
    public static int max(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			ans = Math.max(sum, ans);
			if(sum<0)
				sum=0;
			
		}
		return ans;
	}
    
}