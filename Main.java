public class Main{
    public static void main(String[] args){
        Board board = new Board();

        while(!board.isOver()){
            board.setSpace((int) (Math.random()*3), (int) (Math.random()*3), 1);
            System.out.println(board+"\n");
        }

    }
}