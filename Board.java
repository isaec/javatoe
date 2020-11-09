public class Board {
    private int[][] spaces = {{0,0,0},
                              {0,0,0},
                              {0,0,0}}; //0 is blank, 1 is x, 2 is o


    public boolean isOver(){
        return getWinner(spaces) != 0;}

    public int[][] getSpaces(){return spaces;}

    public int getSpace(int index){
        index = Math.max(0,Math.min(8,index));
        return spaces[index/3][index-((index/3)*3)];
    }

    public static int getWinner(int[][] spaces){ //0 for none, 1 for x, 2 for o
        for(int[] row: spaces){ //now with intense taste of fish
            //horisontal checker
            int numberX = 0;
            int numberO = 0;
            for(int value: row){
                if(value==1){numberX++;}
                else if(value==2){numberO++;}
            }
            if(numberX==3){return 1;}
            if(numberO==3){return 2;}
        }
        //vertical checker
        for(int i = 0; i < 3; i++){
            int numberX = 0;
            int numberO = 0;
            for(int ii = 0; ii < 3; ii++){
                if(spaces[ii][i]==1){numberX++;}
                else if(spaces[ii][i]==2){numberO++;}
            }
            if(numberX==3){return 1;}
            if(numberO==3){return 2;}
        }
        //diagonal checker
        int numberX = 0;
        int numberO = 0;
        for(int i = 0; i < 3; i++){
            if(spaces[i][i]==1){numberX++;}
            else if(spaces[i][i]==2){numberO++;}
        }
        if(numberX==3){return 1;}
        if(numberO==3){return 2;}
        numberX = 0;
        numberO = 0;
        int ii = 2;
        for(int i = 0; i < 3; i++){
            if(spaces[i][ii]==1){numberX++;}
            else if(spaces[i][ii]==2){numberO++;}
            ii--;
        }
        if(numberX==3){return 1;}
        if(numberO==3){return 2;}

        return 0;
    }


    public boolean setSpace(int x, int y, int value){
        System.out.println(this);
        if(
        0<=x && x<=2 && 
        0<=y && y<=2 &&
        (value==1 || value==2)){
            if(this.spaces[x][y] == 0){
                this.spaces[x][y] = value;
                return true;
            }
            else{System.out.println("non zero ->"+x+"-"+y+" is "+spaces[x][y]);System.out.println(this);}
            //else{return false;}
        }
        System.out.println(x+","+y+" to value "+value+" no es bueno");
        return false;
    }

    //to draw board
    public static String getSpaceChar(int spaceInt){
        if(spaceInt==0){return " ";}
        else if(spaceInt==1){return "X";}
        else if(spaceInt==2){return "O";}
        else{return "?";}
    }

    private String[] getAllChars(){
        String[] returnChars = new String[9];
        int i = 0; //tastes kinda like fish
        for(int[] row: spaces){
            for(int col: row){
                returnChars[i] = getSpaceChar(col);
                i++;
            }
        }

        return returnChars;
    }
    

    @Override
    public String toString(){
        String[] allChars = getAllChars();
        return String.format(
        " %s | %s | %s %n-----------%n %s | %s | %s %n-----------%n %s | %s | %s %n",
        allChars[0],allChars[1],allChars[2],
        allChars[3],allChars[4],allChars[5],
        allChars[6],allChars[7],allChars[8]);
    }
}
