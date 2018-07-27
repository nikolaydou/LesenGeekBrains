package game.ii.geek;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Random;

/**
 * Created by Kolya on 26.07.2018.
 */
public class IiGame {
    public void setMap(MapGame[][] map) {
        this.map = map;
    }
    public MapGame[][] getMap() {
        return map;
    }
    private MapGame map[][] ;
private int x1,y1;
    private boolean win = false;
    public boolean getWin(){
        return win;
    }
    private int schetchik = 0;
    private int schetchik1 = 0;
    private int schetchik2 = 0;
    private int schetchik3 = 0;
    public int shag = 0;

    public void isWin(int size) {
        if (shag >= size) {
            for (int i = 0; i < size; i++) {
                if (map[i][i].getKey() == 1) {
                    schetchik++;
                } else if (map[i][size - i - 1].getKey() == 1)
                    schetchik1++;
                if (schetchik == size || schetchik1 == size) {
                    win = true;
                    break;
                }
                for (int j = 0; j < size; j++) {
                    if (map[i][j].getKey() == 1)
                        schetchik2++;
                    if (map[j][i].getKey() == 1)
                        schetchik3++;
                }
                if (schetchik2 == size || schetchik3 == size) {
                    win = true;
                    break;
                }
                else {
                    schetchik2 = 0;
                    schetchik3 = 0;


                }
            }

        }

    }
    public String value = "O";

    private int x;
    private int y;
    public void GetXY(int size){
        do {
            x =new Random().nextInt(size);
            y =new Random().nextInt(size);
            shag++;
        }while(!isHod());
       // isWin(size);
    }

    private boolean isHod(){
        if(map[x][y].getKey()==0) {
            map[x][y].setKey(2);
            map[x][y].setHistory(value);
            return true;
        }
        else {
            System.out.println("ячейка занята попробуй другие координаты ");
            shag--;
            return false;
        }
    }






    public void isWin_player(Player play) {
    x1=play.getX();
    y1=play.getY();
    int wibor=(int)(0+ Math.random()*8);
    }


}
