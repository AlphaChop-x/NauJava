package ru.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkWithArrays {
    public static void main(String[] args) {

        //Создание сканнера и получение из консоли размерности массива
        Scanner scanner = new Scanner(System.in);
        int arrLen = scanner.nextInt();

        //Проверка размера массива
        if (arrLen < 1) {
            System.out.println("Массив не может иметь отрицаетельную размерность!");
        }

        //Инициализация массива заданной длинны arrLen
        int[] arr = new int[arrLen];

        //Создания объекта Random
        Random random = new Random();

        //Инициализация переменной для поиска суммы всех элементов
        int arrSum = 0;

        //Заполнение массива случайным числом
        for (int i = 0; i < arrLen; i++) {
            int number = random.nextInt(5);
            arr[i] = number;
            arrSum += number;
        }

        //Вычисление среднего
        double average = (double) arrSum / arrLen;

        System.out.println(
                Arrays.toString(arr) +
                        "\nСумма всех элементов массива: " + arrSum +
                        "\nСреднее значение: " + average);
    }
}
