class Solution {
    public String tictactoe(int[][] moves) {
        int[][] tictac = new int[3][3];
        for(int i=0;i<moves.length;i++){
            int r = moves[i][0];
            int c = moves[i][1];
            if(i%2==0)
                tictac[r][c] = 1;
            else
                tictac[r][c] = 2;
        }
        for(int i = 0;i<3;i++){
            //column wala match
            if(tictac[i][0]==tictac[i][1] && tictac[i][1]==tictac[i][2] && tictac[i][0]!=0){
                if(tictac[i][0]==1)
                return "A";
                else
                return "B";
            }
            //row wala match
            if(tictac[0][i]==tictac[1][i] && tictac[1][i]==tictac[2][i] && tictac[0][i]!=0){
                if(tictac[0][i]==1)
                return "A";
                else
                return "B";
            }
        }
        //main diagonal
        if(tictac[0][0] == tictac[1][1] && tictac[1][1] == tictac[2][2]&& tictac[0][0]!=0){
            if(tictac[0][0]==1)
            return "A";
            else
            return "B";
        }
        // dusra diagonal
        if(tictac[0][2] == tictac[1][1]&& tictac[1][1]== tictac[2][0] && tictac[0][2]!=0){
            if(tictac[0][2]==1)
            return "A";
            else
            return "B";
        }
        if(moves.length==9)
        return "Draw";
        return "Pending";

    }
}