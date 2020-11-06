public class Main{
    public static void main(String[] args){
        Board board = new Board();

        while(!board.isOver()){
            System.out.println(board);
            break;
        }

    }
}