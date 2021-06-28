package by.epam.unit05.main;

import java.util.Random;
//Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
public class Task02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }

        System.out.print("Initial array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%3d] ", arr[i]);
        }

        int minArr = min(arr);
        int maxArr = max(arr);
        int sum = minArr + maxArr;

        System.out.println("\nThe min number: " + minArr);
        System.out.println("The max number: " + maxArr);
        System.out.println("The sum of min and max: " + sum);
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
