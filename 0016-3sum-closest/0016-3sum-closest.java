class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length-1;

        int ans=nums[0]+nums[1]+nums[2];;
        Arrays.sort(nums);

        for(int i=0;i<n-1;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int a=nums[i];
            int b=i+1;
            int c=n;
            while(b<c){
               
                int x=a+nums[b]+nums[c];
             
                if(Math.abs(target-x)<Math.abs(target-ans)) ans=x;
                if(x>target){
                    c--;
                }
                else b++;
            }
        }
        return ans;
    }
}