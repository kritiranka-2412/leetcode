class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int lo=0;
        int hi=m*n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int ro=mid/n;
            int co=mid%n;
            if(matrix[ro][co]==target)return true;
            if(matrix[ro][co]>target)hi=mid-1;
            else lo=mid+1;

        }
        return false;
    }
}