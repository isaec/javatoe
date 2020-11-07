public class Ai {
    public void makeMove(Board board, int type){
        while(true){
            if(board.setSpace((int)(Math.random()*3), (int)(Math.random()*3), type)){return;}
        }
    }
}
