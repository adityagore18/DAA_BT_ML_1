public class pract5 {
  public static void copy(int board[][],int ans[][],int n){
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++) ans[i][j]=board[i][j];
      }
  }

  public static boolean isSafe(int col,int row,int board[][]){
      int x=row;
      int y=col;
      while(y>=0) {
        if(board[x][y]==1) return false;
        y--;
      }
      x=row;
      y=col;
      while(y>=0 && x>=0) {
        if(board[x][y]==1) return false;
        x--;
        y--;
      }
      x=row;
      y=col;
      while(y>=0 && x<board.length) {
        if(board[x][y]==1) return false;
        x++;
        y--;
      }
      return true;
  }
  public static void solveNQueen(int col,int board[][] ,int ans[][],int n){
    if(col==n){
      copy(board,ans,n);
      return;
    }
    for(int row=0;row<n;row++){
      if(isSafe(col,row,board)){
           board[row][col]=1;
           solveNQueen(col+1, board, ans, n);
           board[row][col]=0;
      }
    }
  }
  public static void main(String[] args) {
      int n=4;
      int board[][]=new int[n][n];
      int ans[][]=new int[n][n];
      solveNQueen(0,board,ans,n);
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)  System.out.print(ans[i][j]+" ");
        System.out.println();
      }
  }
}
