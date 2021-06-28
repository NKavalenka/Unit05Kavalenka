package by.epam.unit05.main;

import java.util.Random;

//Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.print("Initial array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%2d] ", array[i]);
        }

        int a = 1;
        int b = 2;
        int c = 3;
        for (int k = 1, m = 3; m <= array.length; k++, m++) {
            System.out.println("\nSum:  D[" + a + "] + D[" + b + "] + D[" + c + "] = " + sum(array, k, m));
            a++;
            b++;
            c++;
        }
    }

    public static int sum(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k - 1; i <= m - 1; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}

