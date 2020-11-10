public class Ai {
    private int[][] openers = {{0,0},{2,2},{2,0},{0,2}};
    public void makeMove(Board board, int type){
        int[][] spacesCopy = {new int[3],new int[3],new int[3]};
        for(int x = 0; x < 3; x++){ // too lazy to do deepcopy right so we get this
            for(int y = 0; y < 3; y++){
                spacesCopy[x][y] = board.altGetSpace(x,y);}}
        //this is not good code        
        int otherType;
        if(type==1){otherType=2;}
        else{otherType=1;}

        for(int x = 0; x < 3; x++){ //test all moves for win for meee, to take
            for(int y = 0; y < 3; y++){
                if(board.getSpaces()[x][y]==0){
                    spacesCopy[x][y] = type;
                    if(Board.getWinner(spacesCopy)==type){ //if I can win, take killshot
                        if(board.setSpace(x,y,type)){return;}
                    }
                    spacesCopy[x][y]=0;
                }
            }
        }
        
        for(int x = 0; x < 3; x++){ //test all moves for win of a player, to block
            for(int y = 0; y < 3; y++){
                if(board.getSpaces()[x][y]==0){
                    spacesCopy[x][y] = otherType;
                    if(Board.getWinner(spacesCopy)==otherType){ //if I could loose, prevent it
                        if(board.setSpace(x,y,type)){return;} 
                    }
                    spacesCopy[x][y]=0;
                }
            }
        }
        
        // this^^^ whole block is really questionable

        for(int[] opener : openers){ //go for a corner
            if(board.setSpace(opener[0],opener[1], type)){return;}
        }
        while(true){ //make a random play
            if(board.setSpace((int)(Math.random()*3), (int)(Math.random()*3), type)){return;}
        }
 
    }
    
    @Override
    public String toString(){
        return "Ai"; //this is for winner printing
    }
}
