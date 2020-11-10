import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Board board = new Board();
        //pick who goes first
        //Scanner imp = new Scanner(System.in);
        //System.out.print("Would you like to be X(first) or O(second)? (1 or 2): ");
        //int choice = imp.nextInt();


        Ai x = new Ai();
        Player o = new Player();
        

        //gameloop
        while(!board.isOver()){
            System.out.println(board);
            x.makeMove(board,1);
            if(board.isOver()){break;}
            System.out.println(board);
            o.makeMove(board,2);
        }
        String[] winnerStrings = {"uh oh",x.toString(),o.toString(),"Nobody"};
        System.out.println("Game over! "+
        winnerStrings[Board.getWinner(board.getSpaces())]+ //could be better
        " won!");
        System.out.println(board);

    }
}