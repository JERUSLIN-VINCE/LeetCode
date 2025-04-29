PROBLEM: WORDSEARCH
Statement:
      Given an m x n grid of characters board and a string word, return true if word exists in the grid.
     The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are 
     horizontallyor vertically neighboring. The same letter cell may not be used more than once.

Example:
    Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    Output: true

  Solution:
         class WordSearch{
    private static int diff[][]={{-1,0},{1,0},{0,1},{0,-1}};
    private boolean dfs(int r,int c,int row,int col,char board[][],String word,boolean visited[][],int wi){
        if(wi==word.length()){
            return true;
        }
        visited[row][col]=true;
        for(int di=0;di<4;di++){
            int ad1=row+diff[di][0];
            int ad2=col+diff[di][1];
            if(ad1>=0 && ad1<r && ad2>=0 && ad2<c){
                if(!visited[ad1][ad2] && board[ad1][ad2]==word.charAt(wi)){
                     boolean found=dfs(r,c,ad1,ad2,board,word,visited,wi+1);
                     if(found){
                        return true;
                     }                                       
                }

            }
        }
        visited[row][col]=false;
        return false;

    }
public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
         boolean[][] visited=new boolean[R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j]==word.charAt(0)){
                   
                    boolean found=dfs(R,C,i,j,board,word,visited,1);
                    if(found){
                        return true;
                    }
                    }
            }
        }
        return false;
    }
}
