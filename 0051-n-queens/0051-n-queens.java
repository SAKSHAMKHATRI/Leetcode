class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(0,board,ans);
        return ans;
    }
    public void nQueen(int row,char[][] board,List<List<String>> ans){
        int n = board.length;
        List<String> temp = new ArrayList<>();
        if(row==n){
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    s+=board[i][j];
                }
                temp.add(s);
            }
            ans.add(temp);
            return;
        }
        for(int c=0;c<n;c++){
            if(IsSafe(board,row,c)){
                board[row][c]='Q';
                nQueen(row+1,board,ans);
                board[row][c]='.';
            }
        }
    }
    public boolean IsSafe(char[][] board,int row,int col){
        int n = board.length;
        int i=row-1;
        while(i>=0){
            if(board[i][col]=='Q') return false;
            i--;
        }
        //left diagonal
        i=row-1;
        int j = col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        //right diagonal
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }


}