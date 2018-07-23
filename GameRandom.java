package game;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kolya on 23.07.2018.
 */
public class GameRandom {
    Scanner scn = new Scanner(System.in);;

    private void GameCycle(Diktor dir , Player play){
        dir.zagadka();
        dir.print("слово загадано и игра началась\n\n\n пиши свой ответ",false);
        while(!dir.mozg(play.dialog())){
                dir.print("попробуй еще раз посмотри какие буквы ты угадал и дополни свой ответ", true);
        }
        dir.print("", false);
    }
    GameRandom(){
        Diktor dir = new  Diktor();
        Player play = new Player();
        GameCycle(dir , play);
    }

    class Player{
        private int popitki = 0 ;
        private String otvet_Player;
        private String name;
        private String otveti ="";

        public String dialog(){
            otvet_Player = scn.next();
            return otvet_Player;
        }


    }



    class Diktor{
        private String resultat  ="";
        private String World;
        private String otvet_play;
        private Boolean flag_mozg=false;
        public void dialog(){

        }
        private boolean mozg(String otvet){
            otvet_play=otvet;
            if(otvet_play.equals(World)) {
                flag_mozg = true ;
                return true;
            }
            else{
                zamena(otvet_play);
                flag_mozg = false ;
                return false;
            }
        }


        private  void zamena(String arg){
            int iter=0;
            char lop[];
            if(resultat.length()==0)
            lop = new char[World.length()];
            else
            lop=resultat.toCharArray();
            try {
                for (int i = 0; i < World.length(); i++) {
                    iter++;
                    if (World.charAt(i) == arg.charAt(i)) {
                        lop[i] = arg.charAt(i);
                    } else if (resultat.length() == 0)
                        lop[i] = '*';
                }
            }catch(Exception e){
                int size_exeption = World.length()-arg.length();
                for (int i = 0; i < size_exeption ; i++)
                arg+="*";
                for (int i = iter; i < World.length(); i++) {
                    if (World.charAt(i) == arg.charAt(i)) {
                        lop[i] = arg.charAt(i);
                    } else if (resultat.length() == 0)
                        lop[i] = '*';
                }

            }
            resultat = new String(lop);
        }
private boolean isWords(String otvet_play){


return true;
}
        private void print(String print , boolean flag){
    String buf_putka = "";
            if(flag) {
                if ( !flag_mozg) {
                    int rand_zzaputka =1; //(int) (5 + Math.random() * 30);
                    for (int i = 0; i < rand_zzaputka; i++)
                        buf_putka += "*";
                    System.out.println(print+"\n\n\n\n"+resultat+buf_putka);
                } else
                    System.out.println("поздравляю вы отгадали слово");
            }
            else
                System.out.println(print+World);
        }



        private void zagadka(){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                    "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                    "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            String rand = words[(int)(0+ Math.random()*words.length)];
            World = rand;

        }
    }
}
