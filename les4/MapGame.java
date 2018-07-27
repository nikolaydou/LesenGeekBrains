package game.ii.geek;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * Created by Kolya on 26.07.2018.
 */
public class MapGame {
    public String getHistory() {
        return History;
    }

    public void setHistory(String history) {
        History = history;
    }

    private String History =" ";

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    private int key;

    public int createGame(){
        int Size = 3;//(int)(3 + Math.random()*5);

            return  Size;
    }

    MapGame(){

    }
}
