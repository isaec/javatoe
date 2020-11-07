public class Main{
    public static void main(String[] args){
        Board board = new Board();
        Player player = new Player();

        while(!board.isOver()){
            System.out.println(board);
            player.makeMove(board,1);
        }
        System.out.println("Game over!");
        System.out.println(board);

    }
}