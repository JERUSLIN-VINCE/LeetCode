PROBLEM: Set Matrix Zeroes
Statement:
      Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
      You must do it in place.
      
Example:
     Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     Output: [[1,0,1],[0,0,0],[1,0,1]]
      
Solution:
class SetMatrixZeroes{
     public void setZeroes(int[][] matrix) {
         int R=matrix.length;
        int C=matrix[0].length;
        boolean[] ROW=new boolean[R];
        boolean[] COL=new boolean[C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j]==0){
                    ROW[i]=true;
                    COL[j]=true;
                   }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(ROW[i]==true || COL[j]==true){
                    matrix[i][j]=0;
                }
            }
        }
       System.out.print(Arrays.toString(matrix));
       
       

    }
}
