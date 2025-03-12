package ru.task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WorkWithLists {
    public static void main(String[] args) {
        //Создание сканнера и чтение длины массива с консоли
        System.out.print("Enter array's length: ");
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();

        Random random = new Random();

        //Объявление и заполнение массива случайными числами от 1 до 100
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrLen; i++) {
            arr.add(random.nextInt(100));
        }

        System.out.println("Unsorted array: " + arr);

        selectionSort(arr);

        System.out.println("Sorted array: " + arr);
    }

    public static void selectionSort(ArrayList<Integer> intArray) {
        int n = intArray.size();
        int temp;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (intArray.get(j) < intArray.get(minIndex)) {
                    minIndex = j;
                }
            }
            temp = intArray.get(i);
            intArray.set(i, intArray.get(minIndex));
            intArray.set(minIndex, temp);
        }
    }
}

