package game.ii.geek;

/**
 * Created by Kolya on 27.07.2018.
 */
public class Logik {
    private int size;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x;
    private int y;
    private int shag ;
    public void setMap(MapGame[][] map) {
        this.map = map;
    }
    public MapGame[][] getMap() {
        return map;
    }
    private MapGame map[][] ;
private void isWin(){
    if(map[x][y].getKey() == 1&&x!=size-1&&y!=size-1){
    }
}
private void Hod_play(MapGame map[][]){
    this.map=map;
    for(int i = 0 ; i< size ; i++){
        for(int j = 0 ; j< size ; j++){
            if (map[i][j].getKey() == 1) {
                x=i;
                y=j;
            }
        }
    }
}
    private boolean isHod() {
        if (map[x][y].getKey() == 0) {
            return true;
        } else {
            System.out.println("ячейка занята попробуй другие координаты ");
            shag--;
            return false;
        }
    }

    public void GetXY(int size){
        do {

            shag++;
        }while(!isHod());
        // isWin(size);
    }

}
