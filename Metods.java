package com.company;

import java.util.Random;

/**
 * Created by Kolya on 20.07.2018.
 */
public class Metods {

   private static Random rand = new Random();
    public static int[] tusa(int [] arg , int  n){
        int promeg;
        if(n==0){  return arg;}
        else if(n>0){
            for(int i = 0 ; i < n ; i++){
                promeg = arg[arg.length-1];
                for(int j = arg.length-1 ; j > 0 ; j--){
                    arg[j]=arg[j-1];
                }
                arg[0]=promeg;
            }
        }
        else
        {
            for(int i = 0 ; i < Math.abs(n) ; i++){
                promeg = arg[0];
                for(int j =  0 ; j < arg.length-1 ; j++){
                    arg[j]=arg[j+1];
                }
                arg[arg.length-1]=promeg;
            }
        }

        return arg;
    }
////////////////////////////////////////////////////////
   public boolean trueFalse(int []args){
       int size = args.length,left = 0,right = 0,gran = 0;
       if(args.length/2!=0)
           gran=size/2+1;
       for(int i: args)
           System.out.print(i+"  ");
       System.out.println();
       for (int i=0 ; i < size ; i++)
           if(i<gran)
               left+=args[i];
       else
               right+=args[i];

       if(right == left )
       return true;
       else
           return false;
   }
   //////////////////////////////////////////////////////////
    public static double[] randomDouble(){
       int size =30;

       double arr[]= new double[size];

        for (int i=1 ; i < size ; i++)
            arr[i]=rand.nextDouble()*100;
       return arr;
    }

    ///////////////////////////////////////////
    public static int[] randomInt(){
        int size =5;

        int arr[]= new int[size];

        for (int i=1 ; i < size ; i++)
            arr[i]=rand.nextInt()*10;
        return arr;
    }

    ///////////////////////////////////////////////////////
    public static int[] multiplication(int [] arg){
        for (int i=0 ; i < arg.length ; i++)
            if(arg[i]<6)
                arg[i]*=2;

        return arg;
    }
////////////////////////////////////////////////////
    public static int[] zapol(int size){
        int arr[]=new int[size];
        arr[0] = 3;
        for (int i=1 ; i < size ; i++)
            arr[i]=arr[i-1]+3;

        return arr;
    }
    /////////////////////////////////////////////////////////////
    public static int[] zamenaNullOne(int []arg){

        for (int i=0 ; i < arg.length ; i++)
            if(arg[i]==0)
                arg[i]++;
            else
                arg[i]--;

        return arg;
    }

///////////////////////////////////////////////////////////////
    public static int[][] zamenadiag(int [][]arg){
    int size = 1+ (int) (Math.random()*10);
        arg=new int[size][];

        for (int i=0 ; i < size ; i++){
            arg[i]=new int[size];

            for (int j=0 ; j < size ; j++){

                if(i==j||j==size-i-1)
                    arg[i][j]=1;
                else
                arg[i][j]=0;//rand.nextInt();
            }
    }

        return arg;
    }
///////////////////////////////////////////////////////////////////
    public static void minMax(double []arg){
            double min=0,max=arg[0];
        for(double i:arg)
            System.out.print(i+"  ");
        System.out.println();
            for(double i:arg)
                if(i<min)
                    min=i;
            else if(i>max)
                max=i;
            System.out.println("минимум = "+min +" максимум = "+ max);
    }

}
