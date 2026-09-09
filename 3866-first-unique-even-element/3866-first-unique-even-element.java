class Solution {
    public int firstUniqueEven(int[] nums) {
     
        for(int i=0;i<nums.length;i++){
     
            boolean unique=true;
            if(nums[i]%2==0){
               for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && j!=i){
                    unique=false;
                    break;
                }
                
               }
               if(unique) return nums[i];
            }

        }
        return -1;
    }
}