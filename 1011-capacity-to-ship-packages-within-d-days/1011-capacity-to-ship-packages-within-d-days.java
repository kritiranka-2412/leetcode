class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = Integer.MIN_VALUE;
        int hi =0;
        for(int i=0;i<weights.length;i++){
            lo = Math.max(lo, weights[i]);
            hi += weights[i];
        }
        while(lo<hi){
            int mid = (lo+hi)/2;
            int d = 1;
            int cWeight = 0;
            for(int w: weights){
                
                if(cWeight+w>mid){
                    d++;
                    cWeight = 0;
                }
                cWeight+=w;
            }
            if(d<= days)
            hi = mid;
            else
            lo = mid+1;
        }
        return lo;
    }
}