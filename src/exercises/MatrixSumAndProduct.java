package exercises;

import java.util.Scanner;

public class MatrixSumAndProduct {

    public int readN(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = keyboard.nextInt();
        return n;
    }

    public int[][] readMatrix(int size){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the matrix:");
        int [][] matrix = new int[size][size];
        for(int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = keyboard.nextInt();
        return matrix;
    }

    public void printSum(int[][] a, int[][] b){
        System.out.println("The sum is:");
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a[0].length; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }

    public void printProd(int[][] a, int[][] b){
        System.out.println("The sum is:");
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a[0].length; j++)
                System.out.print((a[i][j] * b[i][j]) + " ");
            System.out.println();
        }
    }



}
