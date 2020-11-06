public class Board {
    private int[] spaces = {0,0,3,
                            0,0,0,
                            0,0,0}; //0 is blank, 1 is x, 2 is o

    private boolean over = false;

    public boolean isOver(){
        return over;
    }
    
    private String getSpaceChar(int spaceInt){
        if(spaceInt==0){return " ";}
        else if(spaceInt==1){return "X";}
        else if(spaceInt==2){return "O";}
        else{return"?";}
    }

    private String[] getAllChars(){
        String[] returnChars = new String[9];
        for(int i = 0; i < returnChars.length; i++){
            returnChars[i] = getSpaceChar(spaces[i]);
        }
        return returnChars;
    }
    

    @Override
    public String toString(){
        String[] allChars = getAllChars();
        return String.format(" %s | %s | %s %n-----------%n %s | %s | %s %n-----------%n %s | %s | %s ",
        allChars[0],allChars[1],allChars[3],
        allChars[3],allChars[4],allChars[5],
        allChars[6],allChars[7],allChars[8]);
    }
}
