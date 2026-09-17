class Solution {
    public int minimumSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        int n = grid.length;
        int m = grid[0].length;
        //case 1
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                ans = Math.min(ans, minarea(grid,0,0,i,m-1)+minarea(grid,i+1,0,n-1,j)+ minarea(grid,i+1,j+1,n-1,m-1));
            }
        }
        //case2
        for(int i=0;i<n-1;i++){
            for(int j = 0;j<m-1;j++){
                ans = Math.min(ans, minarea(grid,0,0,i,j)+ minarea(grid,0,j+1,i,m-1)+ minarea(grid, i+1, 0,n-1,m-1));
            }
        }
        //case3
        for(int i = 0; i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                ans = Math.min(ans, minarea(grid,0,0,i,m-1)+ minarea(grid,i+1,0,j,m-1)+minarea(grid,j+1,0,n-1,m-1));
            }
        }
        //case 4
        for(int j=0;j<m-1;j++){
            for(int i = 0;i<n-1;i++){
                ans = Math.min(ans, minarea(grid ,0,0,n-1,j)+minarea(grid,0,j+1,i,m-1)+minarea(grid,i+1,j+1,n-1,m-1));
            }
        }
        //case5
        for(int j=0;j<m-1;j++){
            for(int i=0;i<n-1;i++){
                ans = Math.min(ans, minarea(grid,0,0,i,j)+minarea(grid,i+1,0,n-1,j)+minarea(grid,0,j+1,n-1,m-1));
            }
        }
        //case6
        for(int i=0;i<m-1;i++){
            for(int j=0;j<m-1;j++){
                ans = Math.min(ans, minarea(grid,0,0,n-1,i)+minarea(grid,0,i+1,n-1,j)+minarea(grid,0,j+1,n-1,m-1));
            }
        }
        return ans;
    }
    public static int minarea(int[][] arr, int cr, int cc,int er, int ec){
        int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;
        for(int i = cr ;i<=er;i++){
            for(int j= cc;j<=ec;j++){
                if(arr[i][j]==1){
                    minr = Math.min(minr,i);
                    minc = Math.min(minc,j);
                    maxr = Math.max(maxr,i);
                    maxc = Math.max(maxc , j);
                }
            }
        }
        int l = maxr - minr +1;
        int b = maxc - minc+1;
        return l*b;
    }
}