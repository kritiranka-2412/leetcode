class Solution {
    public int largestAltitude(int[] gain) {
        int[] left = new int[gain.length+1];
        left[0] = 0;
        int max =0;
        for(int i=1;i<left.length;i++){
            left[i] = left[i-1]+gain[i-1];
            if(left[i]>max)
            max = left[i];
        }
        return max;
    }
}