package exercises;

public class Main {
    public static void main(String[] args){
        MatrixSumAndProduct matrixSumAndProduct = new MatrixSumAndProduct();
        int sizeOfMatrix = matrixSumAndProduct.readN();
        int[][] firstMatrix = matrixSumAndProduct.readMatrix(sizeOfMatrix);
        int[][] secondMatrix = matrixSumAndProduct.readMatrix(sizeOfMatrix);
        matrixSumAndProduct.printSum(firstMatrix,secondMatrix);
        matrixSumAndProduct.printProd(firstMatrix,secondMatrix);
    }
}