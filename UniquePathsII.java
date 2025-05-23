PROBLEM: Unique Paths II
Statement:
      You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]).
      The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
      An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
      Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
      The testcases are generated so that the answer will be less than or equal to 2 * 109.
Example:
      Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: 
There is one obstacle in the middle of the 3x3 grid above.
   There are two ways to reach the bottom-right corner:
       1. Right -> Right -> Down -> Down
       2. Down -> Down -> Right -> Right

Solution:
      class UniquePathsII{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int R=obstacleGrid.length;
        int C=obstacleGrid[0].length;
        int [][]dp=new int[R+1][C+1];
        dp[1][0]=1;
        for(int i=1;i<R+1;i++){
            for(int j=1;j<C+1;j++){
                if(obstacleGrid[i-1][j-1]==1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        for(int i=0;i<R+1;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        
        return dp[R][C];
    }
}
