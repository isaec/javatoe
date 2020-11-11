public class Being {
    //please excuse the name
    //this is a duck tape fix
    //it just has a toggle for which method it uses
    //too lazy to redo the rest of this
    //i know they should just both extend a class
    private Ai ai = new Ai();
    private Player player = new Player();
    private int being;

    public void setBeing(int being){
        this.being = being;
    }

    public void makeMove(Board board, int type){
        if(this.being == 1){
            player.makeMove(board, type);
        }
        else{
            ai.makeMove(board, type);
        }
    }

    @Override
    public String toString(){
        if(this.being == 1){
            return player.toString();
        }
        else{
            return ai.toString();
        }
    }
}
