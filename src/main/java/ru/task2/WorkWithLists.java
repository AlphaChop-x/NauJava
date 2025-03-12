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

        bubbleSort(arr);

        System.out.println("Sorted array: " + arr);
    }

    public static void bubbleSort(ArrayList<Integer> intArray) {
        //А вот в питочике можно arr[i],arr[i+1] = arr[i+1],arr[i]
        int temp;
        for (int i = 0; i < intArray.size() - 1; i++) {
            //Флаг для оптимизации
            boolean flag = false;
            for (int j = 0; j < intArray.size() - i - 1; j++) {
                if (intArray.get(j) > intArray.get(j + 1)) {
                    temp = intArray.get(j);
                    intArray.set(j, intArray.get(j + 1));
                    intArray.set(j + 1, temp);
                    flag = true;
                }
            }
            //Если перестановок не было, то заканчиваем цикл
            if (!flag) {
                break;
            }
        }
    }
}
