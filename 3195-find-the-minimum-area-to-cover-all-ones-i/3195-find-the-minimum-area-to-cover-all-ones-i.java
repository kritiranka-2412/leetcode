class Solution {
    public int minimumArea(int[][] grid) {
        int minr = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxc = Integer.MIN_VALUE;
        for(int i = 0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minr = Math.min(i, minr);
                    minc = Math.min(j, minc);
                    maxr = Math.max(i, maxr);
                    maxc = Math.max(j, maxc);
                }
            }
        }
        int l = maxr - minr +1;
        int b = maxc- minc + 1;
        return l*b;
    }
}