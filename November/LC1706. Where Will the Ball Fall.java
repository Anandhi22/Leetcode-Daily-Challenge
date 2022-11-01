class Solution {
    public int[] findBall(int[][] grid) {
     int row = grid.length;
     int col = grid[0].length;
        
        int[] ans = new int[col];
        for(int i=0;i<col;i++)
        { 
            ans[i] = findAns(grid,0,i);
        }
        
        return ans;
    }
    
    public int findAns(int[][] grid, int row, int col)
    {
        if(row >=grid.length)
            return col;
        
        
        //left to right
        else if (grid[row][col] == 1 && col+1<grid[0].length && grid[row][col+1]== 1)
            return findAns(grid, row+1, col+1);
        
        //right to left
         else if(grid[row][col] == -1 && col-1 >= 0 && grid[row][col-1] == -1)
            return findAns(grid, row+1, col-1);
        
        //blocked cases
        else if(grid[row][col]==1 && col+1>=grid[0].length)
            return -1;
        else
            return -1;
    }
    
    
}
