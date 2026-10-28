class Solution {
    public int getLength(int[] nums) {
        int ans = 0;
	        for(int j=0;j<nums.length;j++){
	            HashMap<Integer,Integer> map = new HashMap<>();
	            HashMap<Integer,Integer> freq = new HashMap<>();
	            for(int i=j;i<nums.length;i++){
	                
	                if(map.containsKey(nums[i])){
	                    int old = map.get(nums[i]);
	                
	                    freq.put(old,freq.get(old)-1);
                        if(freq.get(old)==0)
                            freq.remove(old);
                    }
	                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	                int n = map.get(nums[i]);
	                freq.put(n,freq.getOrDefault(n,0)+1);
	            
	            if(map.size()==1)
	                ans = Math.max(ans, i-j+1);
	            else{
	                if(freq.size()==2){
	                    Iterator<Integer> it = freq.keySet().iterator();
	                    int a = it.next();
	                    int b = it.next();
	                    if(a == 2*b || b == 2*a)
	                        ans = Math.max(ans,i-j+1);
	                }
	            }
	        }
	        }
	    return ans;
    }
}