import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Board board = new Board();
        Being x = new Being();
        Being o = new Being();
        //pick who goes first
        Scanner imp = new Scanner(System.in);
        System.out.print("Would you like to be X(first) or O(second) or zero player? (1 or 2 or 0): ");
        int choice = Math.max(0,Math.min(imp.nextInt(),2));
        x.setBeing(choice);
        o.setBeing(choice-1); //this code is comedically bad



        
        

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