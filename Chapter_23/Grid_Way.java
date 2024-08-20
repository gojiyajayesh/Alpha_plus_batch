class Grid_Way{
    public static void main(String []args)
    {
        System.out.println(gridWay(new int[3][3],0,0));
        System.out.println(gridway2(0,0,3,3));
    }
    public static int gridway2(int i,int j,int m,int n)
    {
        if(i==m-1&&j==n-1)
        return 1;
        else if(i==n||j==m)
        {
            return 0;
        }
        int w1=gridway2(i+1,j,m,n);
        int w2=gridway2(i,j+1,m,n);
        return w1+w2;
    }
    public static int gridWay(int[][] grid,int row,int col)
    {
        if(row==grid.length-1&&col==grid[0].length-1)
        {
            return 1;
        }
        else if(row==grid.length||col==grid[0].length)
        {
            return 0;
        }
        int down=gridWay(grid,row+1,col);
        int right=gridWay(grid,row,col+1);
        return down+right;
    }
}