package game.ii.geek;

import java.util.Scanner;

/**
 * Created by Kolya on 26.07.2018.
 */
public class Player {
    public void setMap(MapGame[][] map) {
        this.map = map;
    }

    public MapGame[][] getMap() {
        return map;
    }

    private MapGame map[][];

    private boolean win = false;

    public boolean getWin() {
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

    public String value = "X";

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    private int x;
    private int y;
    private Scanner scn = new Scanner(System.in);
     public void GetXY(int size){
         do {
             System.out.println("введите координату Х ");
             x = scn.nextInt() - 1;
             if (x >= size)
                 x = size - 1;
             else if (x < 0)
                 x = 0;
             System.out.println("введите координату Y ");
             y = scn.nextInt() - 1;
             if (y >= size)
                 y = size - 1;
             else if (y < 0)
                 y = 0;
             shag++;
         }while(!isHod());
         isWin(size);
     }

     private boolean isHod(){
         if(map[x][y].getKey()==0) {
             map[x][y].setKey(1);
             map[x][y].setHistory(value);
             return true;
         }
         else {
             System.out.println("ячейка занята попробуй другие координаты ");
             shag--;
             return false;
         }
     }
}
