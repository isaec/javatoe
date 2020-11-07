public class Ai {
    private int[][] openers = {{0,0},{0,2},{2,0},{2,2}};
    public void makeMove(Board board, int type){
        int[][] spacesCopy = board.getSpaces();
        int otherType;
        if(type==1){otherType=2;}
        else{otherType=1;}
        for(int x = 0; x < 2; x++){ //test all moves for win for a player
            for(int y = 0; y < 2; y++){
                if(spacesCopy[x][y]==0){
                    spacesCopy[x][y] = type;
                    if(board.getWinner(spacesCopy)==type){ //if I can win, take killshot
                        if(board.setSpace(x,y,type)){return;}
                    }
                    else{
                        spacesCopy[x][y]=otherType; //if opponent can win, block them
                        if(board.getWinner(spacesCopy)==otherType){
                            if(board.setSpace(x,y,type)){return;}
                        }
                    }
                    spacesCopy[x][y]=0;
                }
            }
        }// this whole block is really questionable

        for(int[] opener : openers){ //go for a corner
            if(board.setSpace(opener[0],opener[1], type)){return;}
        }
        while(true){ //make a random play
            if(board.setSpace((int)(Math.random()*3), (int)(Math.random()*3), type)){return;}
        }
    }
}
