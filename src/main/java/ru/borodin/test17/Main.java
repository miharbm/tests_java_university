package ru.borodin.test17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*
* Дан входной файл, содержащий совокупность строк. Каждая строка файла соответствует строке квадратной матрицы.
* Написать программу, вводящую эту матрицу в двумерный массив. Вывести исходную и транспонированную ей матрицы.
* (Указание: для работы с файлом использовать новый API из пакета java.nio.file)
* */

public class Main {
    public static void main(String[] args) throws IOException {

        try {
//            Неверный адрес
            Path path = Paths.get("C:\\Users\\Admin\\OneDrive\\Documents\\test17array.txt");

            List<String> list = Files.readAllLines(path);

            int[][] matrix = new int[list.size()][];

            for(int i = 0; i < list.size(); i++){
                matrix[i] = Arrays.stream(list.get(i).split(" ")).mapToInt(Integer::parseInt).toArray();
            }


            System.out.println("Матрицы введеная из файла");
            for (int[] ints : matrix) {
                for (int anInt : ints) {

                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
            

            int[][] matrixTranspose = new int[matrix[0].length][matrix.length];

            for(int i = 0; i < matrixTranspose.length; i++){
                for(int j = 0; j < matrixTranspose[0].length; j++){
                    matrixTranspose[i][j] = matrix[j][i];
                }
            }


            System.out.println("Матрицы транспонированная");

            for (int[] ints : matrixTranspose) {
                for (int anInt : ints) {

                    System.out.print(anInt + " ");
                }
                System.out.println();
            }


        } catch (IOException e){
            System.out.println(e);
        }
    }
}