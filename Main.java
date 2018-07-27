package com.company;

public class Main {
    private static int arr[] = {1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0};

    private static int arr1[] = new int[7];

    private static int arr2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    private static int arr3[][];

    private static int arr4[] = {2, 1, 1, 1, 2};
    public static void main(String[] args) {
       // Leson2();
        GameNumber game = new GameNumber();
                game.Game();
    }









    public static void Leson2(){

        //////////////////////////////////////////////////задание 1
        for (int i : arr)
                System.out.print(i + " ");
        System.out.println();
        arr = Metods.zamenaNullOne(arr);

        for (int i : arr)
                System.out.print(i + " ");
///////////////////////////////////////////////////////////////////задание 2
        arr1 = Metods.zapol(arr1.length);
        System.out.println();
        for (int i : arr1)
                System.out.print(i + " ");
/////////////////////////////////////////////////////// задание 3
        System.out.println();
        for (int i : arr2)
                System.out.print(i + " ");

        arr2 = Metods.multiplication(arr2);
        System.out.println();
        for (int i : arr2)
                System.out.print(i + " ");
//////////////////////////////////////////////////////////////////////////задание 4
        arr3 = Metods.zamenadiag(arr3);
        System.out.println();
        System.out.println();

        for (int[] i : arr3) {
            for (int g : i)
                System.out.print(g + " ");

            System.out.println();
        }
        //////////////////////////////////////////////////////////задание 5
        Metods.minMax(Metods.randomDouble());
        System.out.println();
        ////////////////////////////////////////////////задание 6
        Metods m = new Metods();
        System.out.println(m.trueFalse(arr4));
////////////////////////////////////////////////задание 7
        for (int i : arr2)
                System.out.print(i + " ");
        System.out.println();


        arr2 = Metods.tusa(arr2, -2);

        for (int i : arr2)
                System.out.print(i + " ");
        System.out.println();
        //////////////////////////////////////////// 7.2
        arr2 = Metods.tusa(arr2, 2);

        for (int i : arr2)
                System.out.print(i + " ");

    }
}

