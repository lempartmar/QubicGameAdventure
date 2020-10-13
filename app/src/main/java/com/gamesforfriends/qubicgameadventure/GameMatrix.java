package com.gamesforfriends.qubicgameadventure;

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

}

