package com.gamesforfriends.qubicgameadventure;

import java.util.Arrays;

// Klasa obsługująca matematykę gry
//
public class GameMatrix {

    public static final int MATRIX_SIZE = 5;

    //private int[] matrixSum = new int[MATRIX_SIZE][MATRIX_SIZE];


    // Metoda przejściowa dla metody arraySumFinal
    // Dla dalszego zrozumienia należy przejść do metody arraySumFinal
    private static int[] arraySumPrep(int[] arrayInput) {

        int[] array_Second = new int[MATRIX_SIZE];
        int variable_2 = 0;
        int variable_1 = 0;
        while (variable_2 < array_Second.length) {

            while (arrayInput[variable_1] == arrayInput[variable_2]) {
                array_Second[variable_1] = array_Second[variable_1] + arrayInput[variable_2];
                variable_2++;
                if (variable_2 == MATRIX_SIZE) {
                    break;
                }
            }
            variable_1 = variable_2;
        }


        int[] array_final = new int[5];
        int p = 0;
        int m = 0;

        while (p < MATRIX_SIZE && m < MATRIX_SIZE) {

            while (array_Second[m] == 0 && m < 4) {
                m++;
            }

            array_final[p] = array_Second[m];
            m++;
            p++;
            if (p > m) {
                m = p;
            }

            if (m > MATRIX_SIZE) {
                break;
            }

        }

        return (array_final);

    }

    // metoda sumuje w poszczególnych wierszach poszczególne iteracje tablicy jednowymiarowej
    // zgodnie z metodyką gry
    public static int[] arraySumFinal(int[] arrayFinal) {

        int[] finalCopy = arraySumPrep(arraySumPrep(arraySumPrep(arrayFinal)));
        return (finalCopy);
    }

    // metoda do dzielenia tablic na części
    public static int[] arraySplit(int[] myArray, int rowNumber) {
        int[] myArray1 = Arrays.copyOfRange(myArray, rowNumber*5-5, rowNumber*5-1);
        return myArray1;
    }

    public static int[] arrayMerge(int[] array) {

        for(int i = 0; i<3;i++) {

            System.arraycopy(array[0], 0, array[i+1], 5*(i+1),5);
            System.out.println("Tablica merge[1]: " + array[0]);
            System.out.println("Tablica merge[2]: " + array[1]);
            System.out.println("Tablica merge[3]:: " + array[2]);
            System.out.println("Tablica merge[4]: " + array[3]);
            System.out.println("Tablica merge[5]: " + array[4]);
        }
        return array;
    }

    public static Integer[] arrayRotateLeft(Integer[] array){

        Integer[] finalArray = new Integer[]{
                array[4],array[9],array[14],array[19],array[24],
                array[3],array[8],array[13],array[18],array[23],
                array[2],array[7],array[12],array[17],array[22],
                array[1],array[6],array[11],array[16],array[21],
                array[0],array[5],array[10],array[15],array[20]


        };



        return finalArray;
    }


}

