package com.company;

        import java.util.Scanner;

/**
 * Created by Kolya on 21.07.2018.
 */
public class GameNumber {
    private int zagadka ;
    private boolean flag =false;

    public void setScoreIgrok(int scoreIgrok) {
        this.scoreIgrok = scoreIgrok;
    }
    private int scoreDik = 0;

    public int getScoreIgrok() {
        return scoreIgrok;
    }

    private int scoreIgrok = 0;
    private int victory ;
    private int schetchic = 0;

    private  Diktor dik;
    private int n;
    private int game=1;
    Scanner scn = new Scanner(System.in);

    private void zagadayka(){
        zagadka = (int) (Math.random() * 10);
    }

    GameNumber(){
        dik   =  new Diktor();
        zagadayka();
    }
    public void Game(){
        dik.print("я загадал число");
        while(game==1) {
            schetchic++;
            dik.print(" введите свой вариант ответа  ");
            n=scn.nextInt();
            if (n == zagadka) {
                victory = 0;
                flag=true;
            } else if (n > zagadka)
                victory = 1;
            else {
                victory = -1;

            }
            dik.isflag(victory);

            if(schetchic==3||flag) {
                game=0;
                if(!flag) {
                    scoreDik++;
                    dik.print("Game Over ");
                }

                dik.print( "побед диктора  "+scoreDik + "  побед игрока   "+ scoreIgrok +"\n\n\n" + "хотите с играть еще одну игру да 1 нет 0");
                game = scn.nextInt();


                if(n==1){
                    schetchic=0;
                    zagadayka();
                    dik.print("я загадал число");
                }


            }
        }
    }


    class Diktor{
        private void isflag(int flag){
            switch (flag){
                case 0:print("victory");
                    setScoreIgrok(getScoreIgrok()+1);
                    break;
                case 1:print("больше загаданного числа");
                    break;
                case -1:print("меньше загаданного числа");
                    break;
            }
        }

        private  void print(String arg){
            System.out.println("ответ нашего диктора:-) "+arg);
        }

    }

}
/*1. Написать программу, которая загадывает случайное число от 0 до 9, и
 пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
 должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или
 проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
