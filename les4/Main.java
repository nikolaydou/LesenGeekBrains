package game.ii.geek;

import java.util.Scanner;

/**
 * Created by Kolya on 26.07.2018.
 */
public class Main {

    private MapGame map[][] ;
    private int schetchic = 0;
    private int size = new MapGame().createGame() , fulMap = 0;
    private Player play = new Player();
    private IiGame ii_game = new IiGame();
    public Scanner scn = new Scanner(System.in);
    private boolean flag = false;

    private void pole(){
        if(!flag)
        map = new MapGame[size][];
        for( int i = 0 ; i < size ; i++){
            if(!flag)
            map[i] = new MapGame[size];
            for( int j = 0 ; j < size ; j++){
                if(!flag) {
                    map[i][j] = new MapGame();
                    map[i][j].setKey(0);
                }
                System.out.print("|"+map[i][j].getHistory());
            }
            System.out.print("|");
            System.out.println();
        }
        flag = true;
    }
   private boolean isFullMap(){
       for( int i = 0 ; i < size ; i++)
           for( int j = 0 ; j < size ; j++)
                if(map[i][j].getKey()==0)
                    return true;
        return false;
    }
public void Game(){
       pole();
        do{

            play.setMap(map);
            play.GetXY(size);
            if(isVictory(map)||!isFullMap())
                break;
            map=play.getMap();
            ii_game.setMap(map);
            ii_game.GetXY(size);
            map = ii_game.getMap();
            if(isVictory(map)||!isFullMap())
                break;
            pole();
        }while(isFullMap());
         pole();
        if(play.getWin())
        System.out.print("|victory player|");
    else if(ii_game.getWin())
        System.out.print("|victory bot|");
        else
            System.out.print("|no victory|");
}
private boolean isVictory(MapGame map[][] ){
   if(play.getWin())
        return true;
   else if(ii_game.getWin())
       return true;
       else
           return false;
}


    public static void main (String[] args){
        new Main().Game();
    }

}
