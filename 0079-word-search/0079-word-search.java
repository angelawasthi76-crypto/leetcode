class Solution {

    public boolean dfs(int i,int j, int index , String word, char[][] board){

        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }

        if(board[i][j]!=word.charAt(index)){
            return false;
        }
        char temp =board[i][j];
        board[i][j]='#';

        boolean found = 
            dfs(i+1,j,index+1,word,board  )||
             dfs(i-1,j,index+1,word,board  )||
              dfs(i, j+1,index+1,word,board  )||
               dfs(i,j-1,index+1,word,board  );

        board[i][j]=temp;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        
        int row =board.length;
        int col =board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(i,j,0,word,board)){
                    return true;
                }
            }
        }
        return false;
    }
}