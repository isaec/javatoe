import java.util.Scanner;

public class Player {
    private Scanner imp = new Scanner(System.in);
    public void makeMove(Board board, int type){

        System.out.print("Enter your move(1-9): ");

        int move = imp.nextInt()-1;

        if(move <= 8 && move >= 0 && board.getSpace(move) == 0){
            board.setSpace((move/3),(move-((move/3)*3)),type);
            return;
        }

        System.out.println("invalid. 1-9, only empty spaces.");
        this.makeMove(board, type);//this has to be the wrong way to handle this
        
    }
}
